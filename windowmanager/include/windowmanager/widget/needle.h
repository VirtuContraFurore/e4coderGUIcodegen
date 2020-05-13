#ifndef NEEDLE_H
#define NEEDLE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct needle_widget_data{
    struct Rect dim;
		bool visible;
		struct Bitmap needleImagePath;
		struct Point imagePivotPoint;
		struct Point elementPivotPoint;
		double initialValue;
    void (*value_changed_callback)(struct Widget *self, double new_value, double old_value);//not sure
};

void needle_draw(struct Widget *self);
bool needle_on_touch(struct Widget *self, struct TouchEvent *type);

// TODO: make extern and move definition to .c
struct WidgetFunctions needle_widget_func = {
    .draw = &needle_draw,
    .onTouch = &needle_on_touch,

};

#endif
