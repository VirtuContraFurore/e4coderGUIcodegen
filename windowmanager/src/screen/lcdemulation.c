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

#endif /* TARGET == TARGET_LCDEMULATION */
