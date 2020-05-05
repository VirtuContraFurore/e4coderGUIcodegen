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
    void (*value_changed_callback)(struct widget *self, double new_value, double old_value);
};

void plot_draw(struct widget *self);
void plot_on_touch(struct widget *self, touch_event type, void * event_data);
void plot_check_boundaries(struct widget *self, touch_event type, void * event_data);

struct widget_func plot_widget_func = {
    .draw = &plot_draw,
    .on_touch = &plot_on_touch,
    .check_bounaries = &plot_check_boundaries
};

#endif
