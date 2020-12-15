#include "logging.h"
#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/widget/rectangle.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/core/touch.h"

struct WidgetFunctions rectangle_WidgetFunctions = {
    .draw = &rectangle_draw,
    .onTouch = &rectangle_onTouch,
};

void rectangle_draw(struct Widget *self){
    struct rectangle_Widget* data = (struct rectangle_Widget*) self->data;

    WM_SCRIF_fillRect(data->rect, data->color);
}

bool rectangle_onTouch(struct Widget *self, struct TouchEvent *event){
    struct rectangle_Widget* data = (struct rectangle_Widget*) self->data;

    if (event->type == SINGLE_TOUCH){
        struct SingleTouchData* touch_data = (struct SingleTouchData*) event->event_data;

        if (touch_data->type == TOUCH_DOWN){
            if (pointInRect(touch_data->p, data->rect)){
                if (data->onTouch != NULL)
                    return data->onTouch(self, event);
                else
                    return false;
            }
        }
    }

    return false;
}
