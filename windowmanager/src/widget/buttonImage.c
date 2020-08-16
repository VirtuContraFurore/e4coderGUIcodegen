#include <stddef.h>
#include "windowmanager/widget/buttonImage.h"

struct WidgetFunctions buttonImage_WidgetFunctions = {
    .draw = &buttonImage_draw,
    .onTouch = &buttonImage_onTouch,
};

void buttonImage_draw(struct Widget *self){
    struct buttonImage_Widget* data = (struct buttonLed_Widget*) self->data;
    if(data->isPressed)
        WM_SCRIF_drawBitmap(data->dim.pos, &data->pressedImage);
    else
        WM_SCRIF_drawBitmap(data->dim.pos, &data->releasedImage);
}

bool buttonImage_onTouch(struct Widget *self, struct TouchEvent *event){
    struct buttonImage_Widget* data = (struct buttonLed_Widget*) self->data;

    if (event->type == SINGLE_TOUCH){
        struct SingleTouchData* touch_data = (struct SingleTouchData*) event->event_data;

        if (touch_data->type == TOUCH_DOWN){
            if (pointInRect(touch_data->p, data->dim)){
		if(data->isPressed != true){
		    data->isPressed = true;
                    WM_Widget_redraw(self);
                }
                if (data->onTouch != NULL)
                    return data->onTouch(self, event);
            }
        } else if (touch_data->type == TOUCH_UP){
	    if(data->isPressed == true){
		data->isPressed = false;
                WM_Widget_redraw(self);
                return true;
            }
        }
    }

    return false;
}
