#ifndef SCREENINTERFACE_H
#define SCREENINTERFACE_H

#include "windowmanager/core/touch.h"
#include "lcdemulation/directions.h"

/* SCRIF stands from SCreen InterFace  */

#define SCRIF_EMULATED_OPENGL		0
#define SCRIF_HARD_DISCOVERY		1

/* Setting up a default screen interface */
#define SCRIF_DEF					SCRIF_EMULATED_OPENGL

/* Default screen interface implementation, defined inside screeinterface.c */
#ifdef SCRIF_DEF
extern const struct ScreenInterface * const default_screen_interface;
#endif /* SCRIF_DEF */

static const char IF_DIR_UP=0, IF_DIR_DOWN=1, IF_DIR_RIGHT=2, IF_DIR_LEFT=3;

struct ScreenInterface{
	int width;
	int height;

#if defined SCRIF_DEF && SCRIF_DEF == SCRIF_EMULATED_OPENGL
	void (*initEmulation)(int argc, char ** argv, void (*mainFunc)());
#endif /* SCRIF_DEF = SCRIF_EMULATED_OPENGL */

	struct TouchEvent* (*getTouchEvent)();
	int (*getTouchX)();
	int (*getTouchY)();

	//This must be called after each draw sequence to avoid flickering, due to OpenGL frame buffering
	void (*flush)();

	void (*clearScreen)();
	void (*clearScreenColor)(unsigned short color);
	void (*drawPixel)(int x, int y, unsigned short color);
	void (*drawLine)(int x, int y, int lenght, enum Direction direction, unsigned short color);
	void (*drawUniLine)(int x1, int y1, int x2, int y2, unsigned short color);
	void (*drawUniLineRelative)(int x, int y, int x_rel, int y_rel, unsigned short color);
	void (*drawRect)(int x, int y, int w, int h, unsigned short color);
	void (*drawRect2)(int x, int y, int w, int h, unsigned short color);
	void (*drawFillRect)(int x, int y, int w, int h, unsigned short color);

	//todo: not implemented yet
	void (*drawBitmap)(int x, int y, int bmp_addr);
	void (*drawString)(int x, int y, char * string, int charset, unsigned short color);
};

#endif /* SCREENINTERFACE_H */
