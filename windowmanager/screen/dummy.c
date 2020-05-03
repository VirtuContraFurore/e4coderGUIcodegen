#include "logging.h"
#include "windowmanager/screen/dummy.h"

struct ScreenInterface dummy_ScreenInterface = {
  .getTouch = &dummy_getTouch,
  .clear = &dummy_clear,
  .clearColor = &dummy_clearColor,
  .putPixel = &dummy_putPixel,
  .drawLine = &dummy_drawLine,
  .drawUniLine = &dummy_drawUniLine,
  .drawUniLineRelative = &dummy_drawUniLineRelative,
  .drawRect = &dummy_drawRect,
  .fillRect = &dummy_fillRect,
  .drawBitmap = &dummy_drawBitmap,
  .drawString = &dummy_drawString
};

int dummy_getTouch(struct Point *p){
    LOG_INFO("Generated dummy touch event");
    p->x = 0;
    p->y = 0;
    return 1;
}

void dummy_clear(){
    LOG_INFO("Clear screen.");
}

void dummy_clearColor(struct Color c){
    LOG_INFO("Clear screen with color (%d, %d, %d, %d)",
            c.r, c.g, c.b, c.a);
}

void dummy_putPixel(struct Point p, struct Color c){
    LOG_INFO("Put dummy pixel in point (%d, %d) with color (%d, %d, %d, %d)",
            p.x, p.y,
            c.r, c.g, c.b, c.a);
}

void dummy_drawLine(struct Point from, int length, enum Direction direction, struct Color c){
    LOG_INFO("Draw dummy line from point (%d, %d) of length %d in direction %d with color (%d, %d, %d, %d)",
            from.x, from.y,
            length,
            (int) direction,
            c.r, c.g, c.b, c.a);
}

void dummy_drawUniLine(struct Point from, struct Point to, struct Color c){
    LOG_INFO("Draw dummy line from point (%d, %d) to point (%d, %d) with color (%d, %d, %d, %d)",
            from.x, from.y,
            to.x, to.y,
            c.r, c.g, c.b, c.a);
}

void dummy_drawUniLineRelative(struct Point from, struct Point dist, struct Color c){
    LOG_INFO("Draw dummy line from point (%d, %d) with offset (%d, %d) with color (%d, %d, %d, %d)",
            from.x, from.y,
            dist.x, dist.y,
            c.r, c.g, c.b, c.a);
}

void dummy_drawRect(struct Point pos, int w, int h, struct Color c){
    LOG_INFO("Draw dummy rect from point (%d, %d) with size (%d, %d) with color (%d, %d, %d, %d)",
            pos.x, pos.y,
            w, h,
            c.r, c.g, c.b, c.a);
}

void dummy_fillRect(struct Point pos, int w, int h, struct Color c){
    LOG_INFO("Draw dummy filled rect from point (%d, %d) with size (%d, %d) with color (%d, %d, %d, %d)",
            pos.x, pos.y,
            w, h,
            c.r, c.g, c.b, c.a);
}

void dummy_drawBitmap(struct Point pos, struct Bitmap* bitmap){
    LOG_INFO("Draw bitmap from point (%d, %d) with size (%d, %d)",
            pos.x, pos.y,
            bitmap->w, bitmap->h);
}

void dummy_drawString(struct Point pos, char* string, struct Font* font, struct Color c){
    LOG_INFO("Print string %s at point (%d, %d) with color (%d, %d, %d, %d)",
            string,
            pos.x, pos.y,
            c.r, c.g, c.b, c.a);
}
