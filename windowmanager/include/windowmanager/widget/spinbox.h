#ifndef SPINBOX_H
#define SPINBOX_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

// NOT IMPLEMENTED

struct spinbox_Widget{
    struct Rect dim;
		bool visible;
		char* font;
    double minimum;
    double maximum;
    double value;
    void (*valueChangedCallback)(struct Widget *self, int new_value, int old_value);
};

void spinbox_draw(struct Widget *self);
bool spinbox_on_touch(struct Widget *self, struct TouchEvent *type);

// TODO: make extern and move definition to .c
struct WidgetFunctions spinbox_widget_func = {
    .draw = &spinbox_draw,
    .onTouch = &spinbox_on_touch,

};
#endif

