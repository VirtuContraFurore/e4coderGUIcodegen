#include "stdlib.h"

#include "windowmanager/core/screeninterface.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

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

struct TouchEvent* WM_getTouchEvent(){
	struct Point p;
    int ret;

    ret = WM_SCRIF_getTouch(&p);

	if(ret == 0){
		if(was_touched == false){
			return NULL;
		} else {
			was_touched = false;
			std = (struct SingleTouchData) {.type=TOUCH_UP, .x = last_x, .y = last_y};
			te = (struct TouchEvent) {.type=SINGLE_TOUCH, &std};
			return &te;
		}
	} else if (ret == 1) {
		last_x = p.x;
		last_y = p.y;
		if(was_touched == false){
			was_touched = true;
			first_x = p.x;
			first_y = p.y;
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