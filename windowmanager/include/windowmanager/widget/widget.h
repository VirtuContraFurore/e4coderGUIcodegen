#ifndef WIDGET_H
#define WIDGET_H

#include "stdbool.h"

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"

struct Widget{
    bool visible; //if false the widget will not be drawn and can't be touched
    bool redraw;
    struct WidgetFunctions* funcs;
    void* data;
};

struct WidgetFunctions{
    /**
     * Draw the widget on screen
     */
    void (*draw)(struct Widget *self);

    /**
     * Handle touch on the widget at RELATIVE coordinates (x,y)
     */
    bool (*onTouch)(struct Widget *self, struct TouchEvent *event);
};

/**
 * Marks the widget for redraw and schedules a new redraw.
 * 
 * Only this widget will be redrawn.
 */
void WM_Widget_redraw(struct Widget* widget);

/**
 * Marks the widget for redraw and schedules a forced redraw.
 * 
 * All widgets in the current window will be redrawn.
 */
void WM_Widget_redrawAll(struct Widget* widget);

#endif