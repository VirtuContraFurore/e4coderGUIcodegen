#include <stddef.h>
#include "windowmanager/widget/switch.h"

struct WidgetFunctions switch_WidgetFunctions = {
    .draw = &switch_draw,
    .onTouch = &switch_onTouch,
};

void switch_draw(struct Widget *self){
    struct switch_Widget* data = (struct switch_Widget*) self->data;
    if(data->state){
        WM_SCRIF_drawBitmap(data->dim.pos, &data->onImagePath);
    } else {
        WM_SCRIF_drawBitmap(data->dim.pos, &data->offImagePath);
    }
}

bool switch_onTouch(struct Widget *self, struct TouchEvent *event){
    struct switch_Widget* data = (struct switch_Widget*) self->data;

    if (event->type == SINGLE_TOUCH){
        struct SingleTouchData* touch_data = (struct SingleTouchData*) event->event_data;

        if (touch_data->type == TOUCH_UP){
            data->state = !data->state;
            WM_Widget_redraw(self);
            return true;
        }
    }

    return false;
}
