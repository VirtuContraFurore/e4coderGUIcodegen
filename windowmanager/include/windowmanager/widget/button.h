#ifndef BUTTON_H
#define BUTTON_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct button_widget{
	struct Rect dim;
	bool visible;
	bool state;
	bitmap onImagePath;
	bitmap offImagePath;
	void (*value_changed_callback)(struct widget *self, bool new_value, bool old_value);
};

void button_draw(struct widget *self);
void button_on_touch(struct widget *self, touch_event type, void * event_data);
void button_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func button_widget_func = {
    .draw = &button_draw,
    .on_touch = &button_on_touch,
    .check_bounaries = &button_check_boundaries
};

#endif
