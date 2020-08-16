#include <stddef.h>
#include "windowmanager/widget/buttonLed.h"

struct WidgetFunctions buttonLed_WidgetFunctions = {
    .draw = &buttonLed_draw,
    .onTouch = &buttonLed_onTouch,
};

void buttonLed_draw(struct Widget *self){
    struct buttonLed_Widget* data = (struct buttonLed_Widget*) self->data;
    if(data->isOn){
        if(data->isPressed)
            WM_SCRIF_drawBitmap(data->dim.pos, &data->pressedOnImage);
        else
            WM_SCRIF_drawBitmap(data->dim.pos, &data->releasedOnImage);
    } else {
        if(data->isPressed)
            WM_SCRIF_drawBitmap(data->dim.pos, &data->pressedOffImage);
        else
            WM_SCRIF_drawBitmap(data->dim.pos, &data->releasedOffImage);
    }
}

bool buttonLed_onTouch(struct Widget *self, struct TouchEvent *event){
    struct buttonLed_Widget* data = (struct buttonLed_Widget*) self->data;

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
                data->isOn = !(data->isOn);
                WM_Widget_redraw(self);
                return true;
            }
        }
    }

    return false;
}
