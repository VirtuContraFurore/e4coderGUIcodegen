#ifndef TEXT_H
#define TEXT_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct text_Widget{
	struct Rect dim;
	struct Font font;
	struct Color textColor;
	struct Color backgroundColor;
	char* initialText;
	void (*valueChangedCallback)(struct Widget *self, char* new_value, char* old_value);
};

void textDraw(struct Widget *self);
void textOnTouch(struct Widget *self, struct TouchEvent type, void * event_data);

struct WidgetFunctions textWidgetFunctions = {
    .draw = &textDraw,
    .onTouch = &textOnTouch,
};
#endif
