#ifndef TEXT_H
#define TEXT_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct text_widget{
	struct Rect dim;
	struct Font font;
	struct Color textColor;
	struct Color backgroundColor;
	char* initialText;
	char* horizontalAlignment;
	char* verticalAlignment;
	void (*value_changed_callback)(struct widget *self, char* new_value, char* old_value);
};

void text_draw(struct widget *self);
void text_on_touch(struct widget *self, struct TouchEvent type, void * event_data);

struct WidgetFunctions text_WidgetFunctions = {
    .draw = &text_draw,
    .on_touch = &text_on_touch,
};
#endif
