#ifndef KNOB_H
#define KNOB_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions knob_WidgetFunctions;

struct knob_Widget{
		struct Bitmap image;
		struct Point imagePosition;
		struct Point pivotPosition;
		float angle;
		float base_angle;
		float zero_angle;
    void (*onChange)(struct Widget *self, float new_value, float old_value);
};

void knob_draw(struct Widget *self);
bool knob_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
