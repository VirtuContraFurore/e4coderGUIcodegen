#ifndef WIDGET_RECTANGLE_H
#define WIDGET_RECTANGLE_H

#include "stdbool.h"

#include "logging.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"
#include "windowmanager/graphics/color.h"

extern struct WidgetFunctions rectangle_WidgetFunctions;

struct rectangle_Widget{
    bool (*onTouch)(struct Widget *self, struct TouchEvent *event);
    struct Rect rect;
    struct Color color;
};

void rectangle_draw(struct Widget *self);
bool rectangle_onTouch(struct Widget *self, struct TouchEvent *event);

#endif