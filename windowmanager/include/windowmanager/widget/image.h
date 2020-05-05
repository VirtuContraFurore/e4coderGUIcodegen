#ifndef IMAGE_H
#define IMAGE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct image_widget_data{
    struct Rect dim;
		bool visible;
		bitmap activeImagePath;
		bitmap inactiveImagePath;
		bool initialState;
		bool state;
    void (*value_changed_callback)(struct widget *self, double new_value, double old_value);//not sure
};

void image_draw(struct widget *self);
void image_on_touch(struct widget *self, touch_event type, void * event_data);
void image_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func image_widget_func = {
    .draw = &image_draw,
    .on_touch = &image_on_touch,
    .check_bounaries = &image_check_boundaries
};

#endif
