#ifndef SWITCH_H
#define SWITCH_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct switch_widget{
	struct Rect dim;
	bool state;
	struct Bitmap onImagePath;
	struct Bitmap offImagePath;
	void (*value_changed_callback)(struct Widget *self, bool new_value, bool old_value);
};

void switch_draw(struct Widget *self);
bool switch_on_touch(struct Widget *self, struct TouchEvent *type);

// TODO: make extern and move definition to .c
struct WidgetFunctions switch_widget_func = {
    .draw = &switch_draw,
    .onTouch = &switch_on_touch,

};

#endif
