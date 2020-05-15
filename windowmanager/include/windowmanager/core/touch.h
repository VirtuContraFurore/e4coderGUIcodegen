#ifndef TOUCH_H
#define TOUCH_H

#include "windowmanager/utility/geometry.h"

enum TouchEventType {SINGLE_TOUCH, MULTI_TOUCH, DRAG_TOUCH, NO_TOUCH};

enum TouchType {TOUCH_DOWN, TOUCH_UP};

/**
 * All coordinates are relative to the widget's up-left corner (0,0)
 */

struct TouchEvent{
    enum TouchEventType type;
    void *event_data;
};

struct SingleTouchData {
	struct Point p;
	enum TouchType type;
};

struct MultiTouchData {
	int count;
	enum TouchEventType * touches;
};

struct DragTouchData {
	struct Point start;
	struct Point end;
};

struct TouchEvent* WM_getTouchEvent();

#endif