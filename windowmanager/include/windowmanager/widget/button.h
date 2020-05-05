#ifndef BUTTON_H
#define BUTTON_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct button_widget{
	struct Rect dim;
	bool state;
	struct Bitmap onImage;
	struct Bitmap offImage;
	void (*value_changed_callback)(struct widget *self, bool new_value, bool old_value);
};

void button_draw(struct Widget *self);
void button_on_touch(struct Widget *self, struct TouchEvent type, void * event_data);

struct WidgetFunctions button_WidgetFunctions = {
    .draw = &button_draw,
    .on_touch = &button_on_touch,
};

#endif
