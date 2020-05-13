#ifndef PLOT_H
#define PLOT_H

#include "stdbool.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

struct plot_widget_data{
    struct Rect dim;
		bool visible;
		struct Color lineColor;
		char* yScaleType;
    double yMinimum;
    double yMaximum;
    double scrollWindow;
    void (*value_changed_callback)(struct Widget *self, double new_value, double old_value);
};

void plot_draw(struct Widget *self);
bool plot_on_touch(struct Widget *self, struct TouchEvent *type);


struct WidgetFunctions plot_widget_func = {
    .draw = &plot_draw,
    .onTouch = &plot_on_touch,

};

#endif
