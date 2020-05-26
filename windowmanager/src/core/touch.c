#include "stdlib.h"

#include "windowmanager/core/screeninterface.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

/* How many pixels you must slide to trigger a drag action*/
#define DELTA_DRAG_PX 10

#define ABS(x) ((x)>0) ? (x) : -(x)

static bool was_touched = false;
static struct Point last;
static struct Point first;
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
			std = (struct SingleTouchData) {
                .type=TOUCH_UP,
                .p = last
            };
			te = (struct TouchEvent) {.type=SINGLE_TOUCH, &std};
			return &te;
		}
	} else if (ret == 1) {
		last = p;
		if(was_touched == false){
			was_touched = true;
			first = p;
			std = (struct SingleTouchData) {.type=TOUCH_DOWN, .p = last};
			te = (struct TouchEvent) {.type=SINGLE_TOUCH, &std};
			return &te;
		} else {
			if(ABS(first.x-last.x) > DELTA_DRAG_PX || ABS(first.y-last.y) > DELTA_DRAG_PX){
				dtd = (struct DragTouchData) {.start = first, .end = last};
				te = (struct TouchEvent) {.type=DRAG_TOUCH, &dtd};
				return &te;
			} else
				return NULL;
		}
	} else{
		return NULL;
	}
}
