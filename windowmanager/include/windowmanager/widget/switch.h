#ifndef SWITCH_H
#define SWITCH_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct switch_widget{
	struct Rect dim;
	bool visible;
	bool state;
	bitmap onImagePath;
	bitmap offImagePath;
	void (*value_changed_callback)(struct widget *self, bool new_value, bool old_value);
};

void switch_draw(struct widget *self);
void switch_on_touch(struct widget *self, touch_event type, void * event_data);
void switch_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func switch_widget_func = {
    .draw = &switch_draw,
    .on_touch = &switch_on_touch,
    .check_bounaries = &switch_check_boundaries
};

#endif
