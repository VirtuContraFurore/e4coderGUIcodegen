#ifndef SCREEN_DUMMY_H
#define SCREEN_DUMMY_H

#include "windowmanager/core/windowmanager.h"

int dummy_getTouchEvent(struct TouchEvent *event);
void dummy_clear();
void dummy_clearColor(struct Color c);
void dummy_putPixel(struct Point p, struct Color c);
void dummy_drawLine(struct Point from, int length, enum Direction direction, struct Color c);
void dummy_drawUniLine(struct Point from, struct Point to, struct Color c);
void dummy_drawUniLineRelative(struct Point from, struct Point dist, struct Color c);
void dummy_drawRect(struct Point pos, int w, int h, struct Color c);
void dummy_fillRect(struct Point pos, int w, int h, struct Color c);
void dummy_drawBitmap(struct Point pos, struct Bitmap* bitmap);
void dummy_drawString(struct Point pos, char* string, struct Font* font, struct Color color);

extern struct ScreenInterface dummy_ScreenInterface;

#endif