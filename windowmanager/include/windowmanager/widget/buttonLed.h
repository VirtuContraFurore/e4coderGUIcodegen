#ifndef BUTTON_LED_H
#define BUTTON_LED_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions buttonLed_WidgetFunctions;

struct buttonLed_Widget{
	struct Rect dim;
	struct Bitmap pressedOnImage;
	struct Bitmap releasedOnImage;
	struct Bitmap pressedOffImage;
	struct Bitmap releasedOffImage;
	bool isPressed;
        bool isOn;
	bool (*onTouch)(struct Widget *self, struct TouchEvent *event);
};

void buttonLed_draw(struct Widget *self);
bool buttonLed_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
