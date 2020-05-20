#ifndef SCREENINTERFACE_H
#define SCREENINTERFACE_H

#define TARGET_LCDEMULATION 0
#define TARGET_DISCOVERY 1

#ifndef TARGET
// Default target
#define TARGET TARGET_LCDEMULATION
#endif

#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"
#include "windowmanager/graphics/bitmap.h"
#include "windowmanager/graphics/font.h"
#include "windowmanager/graphics/color.h"

void WM_SCRIF_initEmulation(int argc, char ** argv, void (*mainFunc)());

int WM_SCRIF_getTouch(struct Point *p);

void WM_SCRIF_flush();
void WM_SCRIF_clear();
void WM_SCRIF_clearColor(struct Color c);
void WM_SCRIF_drawPixel(struct Point p, struct Color c);
void WM_SCRIF_drawPixelRaw(int x, int y, unsigned short color);
void WM_SCRIF_drawNextPixelRaw(unsigned short color);
void WM_SCRIF_drawLine(struct Point from, int length, enum Direction direction, struct Color c);
void WM_SCRIF_drawUniLine(struct Point from, struct Point to, struct Color c);
void WM_SCRIF_drawUniLineRelative(struct Point from, struct Point dist, struct Color c);
void WM_SCRIF_drawRect(struct Rect rect, struct Color c);
void WM_SCRIF_fillRect(struct Rect rect, struct Color c);
void WM_SCRIF_drawBitmap(struct Point pos, struct Bitmap* bitmap);
void WM_SCRIF_drawRotateBitmap(struct Point pos, struct Bitmap* bitmap, struct Point axis, float alpha);
void WM_SCRIF_drawChar(struct Rect rect, const unsigned char * font_data, struct Color c);
void WM_SCRIF_drawString(struct Point pos, char* string, struct Font* font, struct Color c);

#endif /* SCREENINTERFACE_H */
