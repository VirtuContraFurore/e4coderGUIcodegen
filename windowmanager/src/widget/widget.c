#include "windowmanager/widget/widget.h"

void widgetRedraw(struct Widget* widget){
    widget->redraw = true;
    WM_scheduleRedraw();
}