#ifndef ROLLER_H
#define ROLLER_H

#include "stdbool.h"

#include "widget/widget.h"
#include "core/touch.h"
#include "utility/geometry.h"

struct roller_WidgetData{
    struct Point pos;
    int radius;
    bool vertical;
    double min;
    double max;
    double value;
    void (*onValueChanged)(struct Widget *self, double new_value, double old_value);
};

void roller_draw(struct Widget *self);
bool roller_onTouch(struct Widget *self, struct TouchEvent *event);

struct WidgetFunctions roller_WidgetFunctions = {
    .draw = &roller_draw,
    .onTouch = &roller_onTouch,
};

#endif