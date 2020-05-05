#ifndef SPINBOX_H
#define SPINBOX_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct spinbox_widget_data{
    struct Rect dim;
		bool visible;
		char* font;
    double minimum;
    double maximum;
    double value;
    void (*value_changed_callback)(struct widget *self, int new_value, int old_value);
};

void spinbox_draw(struct widget *self);
void spinbox_on_touch(struct widget *self, touch_event type, void * event_data);
void spinbox_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func spinbox_widget_func = {
    .draw = &spinbox_draw,
    .on_touch = &spinbox_on_touch,
    .check_bounaries = &spinbox_check_boundaries
};
#endif

