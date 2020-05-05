#ifndef TEXT_H
#define TEXT_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct text_widget{
	struct Rect dim;
	bool visible;
	char* font;
	struct Color textColor;
	struct Color backgroundColor;
	char* initialText;
	char* horizontalAlignment;
	char* verticalAlignment;
	void (*value_changed_callback)(struct widget *self, double new_value, double old_value);
};

void text_draw(struct widget *self);
void text_on_touch(struct widget *self, touch_event type, void * event_data);
void text_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func text_widget_func = {
    .draw = &text_draw,
    .on_touch = &text_on_touch,
    .check_bounaries = &text_check_boundaries
};
#endif
