#ifndef BUTTON_IMAGE_H
#define BUTTON_IMAGE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions buttonImage_WidgetFunctions;

struct buttonImage_Widget{
	struct Rect dim;
	struct Bitmap pressedImage;
	struct Bitmap releasedImage;
	bool isPressed;
	bool (*onTouch)(struct Widget *self, struct TouchEvent *event);
};

void buttonImage_draw(struct Widget *self);
bool buttonImage_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
