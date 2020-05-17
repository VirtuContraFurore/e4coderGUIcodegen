#ifndef BUTTON_H
#define BUTTON_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions button_WidgetFunctions;

struct button_Widget{
	struct Rect dim;
	struct Bitmap Image;
	bool (*onTouch)(struct Widget *self, struct TouchEvent *event);
};

void button_draw(struct Widget *self);
bool button_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
