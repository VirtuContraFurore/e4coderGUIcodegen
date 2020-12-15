#include <stddef.h>
#include "windowmanager/widget/image.h"

struct WidgetFunctions image_WidgetFunctions = {
    .draw = &image_draw,
    .onTouch = &image_onTouch,
};

void image_draw(struct Widget *self){
    struct image_Widget* data = (struct image_Widget*) self->data;
    if(data->state)
        WM_SCRIF_drawBitmap(data->dim.pos, &data->activeImage);
    else
        WM_SCRIF_drawBitmap(data->dim.pos, &data->inactiveImage);
}

bool image_onTouch(struct Widget *self, struct TouchEvent *event){
    return false;
}
