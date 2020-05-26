#ifndef KNOB_H
#define KNOB_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct knob_Widget{
		struct Bitmap image;
		struct Point imagePosition;
		struct Point pivotPosition;
		float angle;
    void (*onChange)(struct Widget *self, float new_value, float old_value);
};

extern struct WidgetFunctions knob_WidgetFunctions;

void knob_draw(struct Widget *self);
bool knob_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
