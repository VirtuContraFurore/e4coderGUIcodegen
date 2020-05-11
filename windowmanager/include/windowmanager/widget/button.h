#ifndef BUTTON_H
#define BUTTON_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"
extern struct WidgetFunctions buttonWidgetFunctions;

struct button_Widget{
	struct Rect dim;
	struct Bitmap Image;
	void (*valueChangedCallback)(struct Widget *self, bool new_value, bool old_value);
};

void buttonDraw(struct Widget *self);
bool buttonOnTouch(struct Widget *self, struct TouchEvent *type);


#endif
