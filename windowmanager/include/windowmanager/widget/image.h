#ifndef IMAGE_H
#define IMAGE_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct image_widget_data{
    struct Rect dim;
		struct Bitmap activeImage;
		struct Bitmap inactiveImage;
		bool initialState;
		bool state;
    void (*value_changed_callback)(struct Widget *self, double new_value, double old_value);//not sure
};

void image_draw(struct Widget *self);
bool image_on_touch(struct Widget *self, struct TouchEvent *type);

// TODO: make extern and move definition to .c
struct WidgetFunctions image_widget_func = {
    .draw = &image_draw,
    .onTouch = &image_on_touch,
};

#endif
