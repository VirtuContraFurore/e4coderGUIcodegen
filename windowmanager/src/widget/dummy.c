#include "logging.h"

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/widget/dummy.h"
#include "windowmanager/graphics/color.h"

struct WidgetFunctions dummy_WidgetFunctions = {
    .draw = &dummy_draw,
    .onTouch = &dummy_onTouch,
};

void dummy_draw(struct Widget *self){
    LOG_INFO("Call dummy draw");
    WM_SCRIF_drawPixel((struct Point){50, 50}, RED);
    LOG_INFO("Exit dummy draw");
}

bool dummy_onTouch(struct Widget *self, struct TouchEvent *event){
    LOG_INFO("Calling user callback");
    ((struct dummy_WidgetData*) (self->data))->onTouch(self, event);
    return true;
}
