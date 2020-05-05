
#include "windowmanager/widget/switch.h"

void switchDraw(struct Widget *self){
    struct switch_Widget data = (struct switch_Widget*) self->data;
    
    if(*data->state){
      WM_SCRIF_drawBitmap({*data->dim.x,*data->dim.y}, *data->onImage);
      }
     else{
      WM_SCRIF_drawBitmap({*data->dim.x,*data->dim.y}, *data->offImage);
      }
}

bool switchOnTouch(struct Widget *self, struct TouchEvent *event){
    struct switch_Widget data = (struct button_Widget*) self->data;
    
    if (event->type == SINGLE_TOUCH){
        struct SingleTouchData* touch_data = (struct SingleTouchData*) event->event_data;

        if (touch_data->type == TOUCH_DOWN){
            if (pointInRect(touch_data->p, *data->dim)){
                if (data->onTouch != NULL)
                    *data->state=!(*data->state);
                    return *data->onTouch(self, event);
                else
                    return false;
            }
        }
    }
    
    return false;
}
