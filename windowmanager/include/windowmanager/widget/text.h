#ifndef TEXT_H
#define TEXT_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions text_WidgetFunctions;

struct text_Widget{
	struct Rect dim;
	struct Font *font;
	struct Color textColor;
	struct Color backgroundColor;
	char* initialText;
};

void text_draw(struct Widget *self);
bool text_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
