#include "windowmanager/widget/button.h"

void buttonDraw(struct Widget *self){
    struct button_Widget* data = (struct button_Widget*) self->data;
    
      WM_SCRIF_fillRect(data->dim, data->backgroundColor);
      WM_SCRIF_drawString({data->dim.x+1,data->dim.y+1}, data->initialText, data->font, data->textColor);
}

bool buttonOnTouch(struct Widget *self, struct TouchEvent *event){
        
    return false;
}
