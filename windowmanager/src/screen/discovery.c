#include <stdbool.h>
#include <stddef.h>

#include "logging.h"

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/screeninterface.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/graphics/bitmap.h"
#include "windowmanager/graphics/font.h"

#if TARGET == TARGET_DISCOVERY

#include "stm32f4_discovery_lcd.h"
#include "STMPE811QTR.h"
#include "LCD_Touch_Calibration.h"

#define TOUCH_AD_VALUE_MAX    (4000)
#define TOUCH_AD_VALUE_MIN    (100)

void _setColor(struct Color c){
  struct Color bck_col = WM_getWindow(0)->background;
  LCD_SetColors(TO_565(c), TO_565(bck_col));
}

int WM_SCRIF_getTouch(struct Point *p){
  TS_STATE *pstate = NULL;

  pstate = IOE_TS_GetState();
  if (!pstate->TouchDetected){
    return 0;
  }

  p->x = pstate->X;
  p->y = pstate->Y;

  /* If AD result is abnormal, then LCD show nothing */
  if ((p->x > TOUCH_AD_VALUE_MAX)
      || (p->x < TOUCH_AD_VALUE_MIN)
      || (p->y > TOUCH_AD_VALUE_MAX)
      || (p->y < TOUCH_AD_VALUE_MIN)) {
    return 0;
  }

  p->x = ((int)(p->x * adjust_Para.xScale - adjust_Para.xOffset));
  p->y = ((int)(p->y * adjust_Para.yScale - adjust_Para.yOffset));

  if (p->x >= LCD_PIXEL_WIDTH) {
      p->x = LCD_PIXEL_WIDTH -1;
  }
  if (p->y >= LCD_PIXEL_HEIGHT) {
    p->y = LCD_PIXEL_HEIGHT -1;
  }

  return 1;
}

void WM_SCRIF_flush(){}
void WM_SCRIF_clear(){
  LCD_Clear(TO_565(BLACK));
}

void WM_SCRIF_clearColor(struct Color c){
  LCD_Clear(TO_565(c));
}

void WM_SCRIF_drawPixel(struct Point p, struct Color c){
  _setColor(c);
  if(p.x < 0 || p.x > LCD_PIXEL_WIDTH-1 || p.y < 0 || p.y > LCD_PIXEL_HEIGHT-1)
  {
    return;
  }
  LCD_DrawLine(p.x, p.y, 1, LCD_DIR_HORIZONTAL);
}

void WM_SCRIF_drawPixelRaw(int x, int y, unsigned short color){
  if(x < 0 || x > LCD_PIXEL_WIDTH - 1 || y < 0 || y > LCD_PIXEL_HEIGHT - 1)
    return;
  LCD_SetCursor(x, y);
  LCD_WriteRAM_Prepare();
  LCD_WriteRAM(color);
}

void WM_SCRIF_drawLine(struct Point from, int length, enum Direction direction, struct Color c){
  struct Point real_from;
  uint8_t real_dir;

  switch(direction){
    case LEFT:
      real_from = (struct Point){
        .x = from.x - length,
        .y = from.y
      };
      real_dir = LCD_DIR_HORIZONTAL;
      break;
    case RIGHT:
      real_from = from;
      real_dir = LCD_DIR_HORIZONTAL;
      break;
    case UP:
      real_from = (struct Point){
        .x = from.x,
        .y = from.y - length
      };
      real_dir = LCD_DIR_VERTICAL;
      break;
    case DOWN:
      real_from = from;
      real_dir = LCD_DIR_VERTICAL;
      break;
  }

  _setColor(c);
  LCD_DrawLine(real_from.x, real_from.y, length, real_dir);
}

void WM_SCRIF_drawUniLine(struct Point from, struct Point to, struct Color c){
  _setColor(c);
  LCD_DrawUniLine(from.x, from.y, to.x, to.y);
}

void WM_SCRIF_drawUniLineRelative(struct Point from, struct Point dist, struct Color c){
  struct Point real_to = {
    .x = from.x + dist.x,
    .y = from.y + dist.y
  };

  _setColor(c);
  LCD_DrawUniLine(from.x, from.y, real_to.x, real_to.y);
}

void WM_SCRIF_drawRect(struct Rect rect, struct Color c){
  _setColor(c);
  LCD_DrawRect(rect.pos.x, rect.pos.y, rect.h, rect.w);
}

void WM_SCRIF_fillRect(struct Rect rect, struct Color c){
  _setColor(c);
  LCD_DrawFullRect(rect.pos.x, rect.pos.y, rect.h, rect.w);
}

#endif /* TARGET == TARGET_DISCOVERY */
