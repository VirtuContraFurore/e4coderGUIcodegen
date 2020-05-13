#include "windowmanager/widget/widget.h"

void WM_Widget_redraw(struct Widget* widget){
    widget->redraw = true;
    WM_scheduleRedraw();
}

void WM_Widget_redrawAll(struct Widget* widget){
    widget->redraw = true;
    WM_scheduleForcedRedraw();
}