#ifndef LCD_EMULATION_H
#define LCD_EMULATION_H

#define LCD_UPDATE_PERIOD_MS	50
#define LCD_WIDTH	320
#define LCD_HEIGHT	240

#include "directions.h"

/**
 * Init the LCD emulaton using OpenGL.
 * 'mainFunc' will be the program's main loop.
 * */
void LcdInitEmulation(int argc, char ** argv, void (*mainFunc)());

/**
 * Returns the current touch point in screen coordinates.
 * Returns a negative value if there is no touch input available.
 * */
int LcdTouchX();
int LcdTouchY();

//This must be called after each draw sequence to avoid flickering, due to opengl framebuffering
void LcdFlush();

void LcdClear();
void LcdClearColor(unsigned short color);
void LcdPutPixel(int x, int y, unsigned short color);
void LcdDrawLine(int x, int y, int lenght, enum LEMU_Direction direction, unsigned short color);
void LcdDrawUniLine(int x1, int y1, int x2, int y2, unsigned short color);
void LcdDrawUniLineRelative(int x, int y, int x_rel, int y_rel, unsigned short color);
void LcdDrawRect(int x, int y, int w, int h, unsigned short color);
void LcdDrawRect2(int x, int y, int w, int h, unsigned short color);
void LcdFillRect(int x, int y, int w, int h, unsigned short color);

//todo:
void LcdDrawBitmap(int x, int y, int bmp_addr);
void LcdDrawString(int x, int y, char * string, int charset, unsigned short color);


#endif /* LCD_EMULATION_H */
