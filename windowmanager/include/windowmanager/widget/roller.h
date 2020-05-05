#ifndef ROLLER_H
#define ROLLER_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct roller_widget_data{
    struct Point pos;
		int radius;
		bool visible;
    bool vertical;
    double minimum;
    double maximum;
    double value;
    void (*value_changed_callback)(struct widget *self, double new_value, double old_value);
};

void roller_draw(struct widget *self);
void roller_on_touch(struct widget *self, touch_event type, void * event_data);
void roller_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func roller_widget_func = {
    .draw = &roller_draw,
    .on_touch = &roller_on_touch,
    .check_bounaries = &roller_check_boundaries
};

#endif
