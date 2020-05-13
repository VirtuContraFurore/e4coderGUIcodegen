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

void text_draw(struct Widget *self);
bool text_onTouch(struct Widget *self, struct TouchEvent *type);

// TODO: make extern and move definition to .c
struct WidgetFunctions textWidgetFunctions = {
    .draw = &text_draw,
    .onTouch = &text_onTouch,
};
#endif
