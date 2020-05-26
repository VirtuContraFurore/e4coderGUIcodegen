#include <stddef.h>
#include "windowmanager/widget/needle.h"

struct WidgetFunctions needle_WidgetFunctions = {
    .draw = &needle_draw,
    .onTouch = &needle_onTouch,
};

void needle_draw(struct Widget *self){
    struct needle_Widget* data = (struct needle_Widget*) self->data;
    WM_SCRIF_drawRotateBitmap(data->imagePosition, &data->image, data->pivotPosition, data->angle);
}

bool needle_onTouch(struct Widget *self, struct TouchEvent *event){
    return false;
}
