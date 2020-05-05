#ifndef NEEDLE_H
#define NEEDLE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct needle_widget_data{
    struct Rect dim;
		bool visible;
		bitmap needleImagePath;
		struct Point imagePivotPoint;
		struct Point elementPivotPoint;
		double initialValue;
    void (*value_changed_callback)(struct widget *self, double new_value, double old_value);//not sure
};

void needle_draw(struct widget *self);
void needle_on_touch(struct widget *self, touch_event type, void * event_data);
void needle_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func needle_widget_func = {
    .draw = &needle_draw,
    .on_touch = &needle_on_touch,
    .check_bounaries = &needle_check_boundaries
};

#endif
