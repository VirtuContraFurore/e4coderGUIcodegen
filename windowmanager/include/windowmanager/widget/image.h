#ifndef IMAGE_H
#define IMAGE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions image_WidgetFunctions;

struct image_Widget{
    struct Rect dim;
		struct Bitmap activeImage;
		struct Bitmap inactiveImage;
		bool initialState;
		bool state;
    void (*valueChangedCallback)(struct Widget *self, double new_value, double old_value);//not sure
};

void image_draw(struct Widget *self);
bool image_onTouch(struct Widget *self, struct TouchEvent *type);

#endif
