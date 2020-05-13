#if TARGET == TARGET_LCDEMULATION

#include <stdbool.h>
#include <stddef.h>

#include "logging.h"

#include "lcdemulation/lcd_emulation.h"

#include "windowmanager/core/screeninterface.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/graphics/bitmap.h"
#include "windowmanager/graphics/font.h"

void WM_SCRIF_initEmulation(int argc, char ** argv, void (*mainFunc)()){
    LcdInitEmulation(argc, argv, mainFunc);
}

int WM_SCRIF_getTouch(struct Point *p){
    p->x = LcdTouchX();
    p->y = LcdTouchY();

    if (p->x < 0 || p->y < 0)
        return 0;
    else
        return 1;
}

void WM_SCRIF_flush(){
    LcdFlush();
}

void WM_SCRIF_clear(){
    LcdClear();
}

void WM_SCRIF_clearColor(struct Color c){
    LcdClearColor(TO_565(c));
}

void WM_SCRIF_drawPixel(struct Point p, struct Color c){
    LcdPutPixel(p.x, p.y, TO_565(c));
}

void WM_SCRIF_drawLine(struct Point from, int length, enum Direction direction, struct Color c){
    LcdDrawLine(from.x, from.y, length, (enum LEMU_Direction) direction, TO_565(c));
}

void WM_SCRIF_drawUniLine(struct Point from, struct Point to, struct Color c){
    LcdDrawUniLine(from.x, from.y, to.x, to.y, TO_565(c));
}

void WM_SCRIF_drawUniLineRelative(struct Point from, struct Point dist, struct Color c){
    LcdDrawUniLine(from.x, from.y, dist.x, dist.y, TO_565(c));
}

void WM_SCRIF_drawRect(struct Rect rect, struct Color c){
    LcdDrawRect(rect.pos.x, rect.pos.y, rect.w, rect.h, TO_565(c));
}

void WM_SCRIF_fillRect(struct Rect rect, struct Color c){
    LcdFillRect(rect.pos.x, rect.pos.y, rect.w, rect.h, TO_565(c));
}

void WM_SCRIF_drawBitmap(struct Point pos, struct Bitmap* bitmap){
  LcdDrawBitmap(pos.x, pos.y, bitmap->width, bitmap->height, (void*) bitmap->bmp);
}

void WM_SCRIF_drawRotateBitmap(struct Point pos, struct Bitmap* bitmap, float alpha){
  int i, j;
  short color;
  unsigned char mask = 1;
  float cosA, sinA;

  cosA = cos(alpha);
  sinA = sin(alpha);

  for(i = 0; i < bitmap->height; i++){
    for(j = 0; j < bitmap->width; j++){
      int r_x, r_y, x, y;

      mask = (mask == 1) ? 128 : (mask >> 1);
      if((bitmap->alpha[(i * bitmap->width + j) / 8] & mask) == 0)
        continue;

      color = bitmap->bmp[i * bitmap->width + j];

      x = j - bitmap->width / 2;
      y = i - bitmap->height / 2;
      r_x = x * cosA - y * sinA + pos.x;
      r_y = x * sinA + y * cosA + pos.y;

      // fatto veloce
      LcdDrawRect(r_x, r_y, 2, 2, color);
    }
  }
}

void WM_SCRIF_drawString(struct Point pos, char* string, struct Font* font, struct Color c){
    unsigned short color = TO_565(c);
    int i = 0;

    while(string[i] != '\0'){
      /* Manage space char */
      if(string[i] == ' '){
    	  pos.x +=font->symbols[(int)'a'-33].width; /* Use the same width of 'a' character. */
    	  i++;
    	  continue;
      }
      int index = (int)string[i] - 33;
      int w = font->symbols[index].width;
      int h = font->symbols[index].height;
      int N = w * h;

      LcdDrawChar(pos.x, pos.y, w, h, (void*) font->symbols[index].data, color);

      /*for(int j = 0; j < N + 8; j += 8){
        int mask = 128;
        for(int k = 0; k < 8; k++){
          if(j + k < N && (mask & font->symbols[index].data[j / 8])){
            int x = (j + k) % w;
            int y = (j + k) / w;

            LcdPutPixel(x + pos.x, y + pos.y, color);
          }
          mask >>= 1;
        }
      }*/

      pos.x += w;
      i++;
    }
}

#endif /* TARGET == TARGET_LCDEMULATION */
