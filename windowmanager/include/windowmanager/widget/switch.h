#ifndef SWITCH_H
#define SWITCH_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions switch_WidgetFunctions;

struct switch_Widget{
	struct Rect dim;
	bool state;
	struct Bitmap onImagePath;
	struct Bitmap offImagePath;
	void (*valueChangedCallback)(struct Widget *self, bool new_value, bool old_value);
};

void switch_draw(struct Widget *self);
bool switch_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
