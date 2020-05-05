#ifndef BUTTON_H
#define BUTTON_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct button_Widget{
	struct Rect dim;
	struct Bitmap Image;
	void (*valueChangedCallback)(struct Widget *self, bool new_value, bool old_value);
};

void buttonDraw(struct Widget *self);
void buttonOnTouch(struct Widget *self, struct TouchEvent type, void * event_data);

struct WidgetFunctions buttonWidgetFunctions = {
    .draw = &buttonDraw,
    .onTouch = &buttonOnTouch,
};

#endif
