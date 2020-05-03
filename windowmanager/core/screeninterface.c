#include <stdbool.h>
#include <stddef.h>

#include "windowmanager/core/screeninterface.h"
#include "windowmanager/core/touch.h"

/* Private getTouchEvent default implementation */
#ifdef SCRIF_DEF

/* How many pixels you must slide to trigger a drag action*/
#define DELTA_DRAG_PX 10

#define ABS(x) ((x)>0) ? (x) : -(x)

static bool was_touched = false;
static int last_x, last_y;
static int first_x, first_y;
//avoid malloc and free using singletons
static struct TouchEvent te;
static struct SingleTouchData std;
static struct DragTouchData dtd;

struct TouchEvent* getTouchEvent_default(){
	int x = (*default_screen_interface->getTouchX)();
	int y = (*default_screen_interface->getTouchY)();

	if(x < 0 || y < 0){
		if(was_touched == false){
			return NULL;
		} else {
			was_touched = false;
			std = (struct SingleTouchData) {.type=TOUCH_UP, .x = last_x, .y = last_y};
			te = (struct TouchEvent) {.type=SINGLE_TOUCH, &std};
			return &te;
		}
	} else {
		last_x = x;
		last_y = y;
		if(was_touched == false){
			was_touched = true;
			first_x = x;
			first_y = y;
			std = (struct SingleTouchData) {.type=TOUCH_DOWN, .x = last_x, .y = last_x};
			te = (struct TouchEvent) {.type=SINGLE_TOUCH, &std};
			return &te;
		} else {
			if(ABS(first_x-last_x) > DELTA_DRAG_PX || ABS(first_y-last_y) > DELTA_DRAG_PX){
				dtd = (struct DragTouchData) {.start_x = first_x, .start_y = first_y, .end_x = last_x, .end_y = last_y};
				te = (struct TouchEvent) {.type=DRAG_TOUCH, &std};
				return &te;
			} else
				return NULL;
		}
	}
}

#endif /* SCRIF_DEF */

/* Default Screen Interface is emulated OpenGL rendering is used */
#if defined SCRIF_DEF && SCRIF_DEF == SCRIF_EMULATED_OPENGL

#include "lcdemulation/lcd_emulation.h"

/* Declaring it "static const" to force the compiler to put it inside the .text section and save ram */
static const struct ScreenInterface default_screen_interface_value = {
		.width = LCD_WIDTH,
		.height = LCD_WIDTH,

		.initEmulation = &LcdInitEmulation,

		.getTouchX = &LcdTouchX,
		.getTouchY = &LcdTouchY,
		.getTouchEvent = &getTouchEvent_default,

		.flush = &LcdFlush,

		.clearScreen = &LcdClear,
		.clearScreenColor = &LcdClearColor,

		.drawPixel = &LcdPutPixel,
		.drawLine = &LcdDrawLine,
		.drawUniLine = &LcdDrawUniLine,
		.drawUniLineRelative = &LcdDrawUniLineRelative,
		.drawRect = &LcdDrawRect,
		.drawRect2 = &LcdDrawRect2,
		.drawFillRect = &LcdFillRect
};

/* Bind it to the external pointer: */
const struct ScreenInterface * const default_screen_interface = &default_screen_interface_value;

#endif /* SCRIF_DEF = SCRIF_EMULATED_OPENGL */
