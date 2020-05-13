#include <stddef.h>
#include "windowmanager/widget/text.h"

struct WidgetFunctions text_WidgetFunctions = {
    .draw = &text_draw,
    .onTouch = &text_onTouch,
};

void text_draw(struct Widget *self){
    struct text_Widget* data = (struct text_Widget*) self->data;

    if (data->backgroundColor.a != 255){
        WM_SCRIF_fillRect(data->dim, data->backgroundColor);
    }

    WM_SCRIF_drawString(
          data->dim.pos, 
          data->initialText,
          data->font,
          data->textColor
    );
}

bool text_onTouch(struct Widget *self, struct TouchEvent *event){
    return false;
}
