#ifndef NEEDLE_H
#define NEEDLE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions needle_WidgetFunctions;

struct needle_Widget{
		struct Bitmap image;
		struct Point imagePosition;
		struct Point pivotPosition;
		float angle;
};

void needle_draw(struct Widget *self);
bool needle_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
