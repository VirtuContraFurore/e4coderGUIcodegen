#include <stddef.h>
#include "windowmanager/widget/knob.h"
#include <math.h>

#include <stdio.h>

struct WidgetFunctions knob_WidgetFunctions = {
    .draw = &knob_draw,
    .onTouch = &knob_onTouch,
};

void knob_draw(struct Widget *self){
    struct knob_Widget* data = (struct knob_Widget*) self->data;
    WM_SCRIF_drawRotateBitmap(data->imagePosition, &data->image, data->pivotPosition, data->angle);
}

bool knob_onTouch(struct Widget *self, struct TouchEvent *event){
    struct knob_Widget* data = (struct knob_Widget*) self->data;
    struct DragTouchData *evt_drag;
    struct SingleTouchData *evt_touch;
    int x, y, cx, cy;
    cx = data->imagePosition.x;
    cy = data->imagePosition.y;

    switch(event->type){
      case DRAG_TOUCH:
        evt_drag = (struct DragTouchData*) event->event_data;
        x = evt_drag->end.x;
        y = evt_drag->end.y;
        break;

      case SINGLE_TOUCH:
        evt_touch = (struct SingleTouchData*) event->event_data;
        x = evt_touch->p.x;
        y = evt_touch->p.y;
        break;
      default:
        return false;
    }
    #define max(x, y) (x) > (y) ? (x) : (y)
    int r = max(max(data->image.width - cx, data->image.height - cy), max(cx, cy));
    if((x - cx) * (x - cx) + (y - cy) * (y - cy) > r * r)
      return false;

    float pre_val = data->angle;
    float new_val = (float) atan2f((float) y - cy, (float) x - cx);

    if(data->onChange != NULL)
      data->onChange(self, pre_val, new_val);

    return true;
}
