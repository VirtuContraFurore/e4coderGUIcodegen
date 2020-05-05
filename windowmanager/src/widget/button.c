#include "windowmanager/widget/button.h"

void buttonDraw(struct Widget *self){
    struct button_Widget* data = (struct button_Widget*) self->data;
    
      WM_SCRIF_drawBitmap({data->dim.x,data->dim.y}, data->Image);
}

bool buttonOnTouch(struct Widget *self, struct TouchEvent *event){
    struct button_Widget* data = (struct button_Widget*) self->data;
    
    if (event->type == SINGLE_TOUCH){
        struct SingleTouchData* touch_data = (struct SingleTouchData*) event->event_data;

        if (touch_data->type == TOUCH_DOWN){
            if (pointInRect(touch_data->p, data->dim)){
                if (data->onTouch != NULL)
                    return data->onTouch(self, event);
                else
                    return false;
            }
        }
    }
    
    return false;
}
