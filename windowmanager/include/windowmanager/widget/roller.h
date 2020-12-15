#ifndef ROLLER_H
#define ROLLER_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

// NOT IMPLEMENTED

struct roller_Widget{
    struct Point pos;
		int radius;
		bool visible;
    bool vertical;
    double minimum;
    double maximum;
    double value;
    void (*valueChangedCallback)(struct Widget *self, double new_value, double old_value);
};

void roller_draw(struct Widget *self);
bool roller_on_touch(struct Widget *self, struct TouchEvent *type);

// TODO: make extern and move definition to .c
struct WidgetFunctions roller_widget_func = {
    .draw = &roller_draw,
    .onTouch = &roller_on_touch,
};

#endif
