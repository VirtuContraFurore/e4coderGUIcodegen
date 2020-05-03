#include <time.h>

#include "logging.h"

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/widget/dummy.h"
#include "windowmanager/screen/dummy.h"

void m_dummy_onTouch(struct Widget *self, struct TouchEvent *event){
    LOG_INFO("Handled dummy touch event");
    self->redraw = true;
    WM_scheduleRedraw();
}

struct dummy_WidgetData dummy_widget_data = {
    .onTouch = &m_dummy_onTouch
};

struct Widget widget = {
    .visible = true,
    .funcs = &dummy_WidgetFunctions,
    .data = (void*) &dummy_widget_data
};

struct Window window = {
    .widgets = &widget,
    .n_widgets = 1
};

int main(){
    WM_init(&window, 1, &dummy_ScreenInterface);
    while(1){
        WM_handleEvents();
        WM_update();
        usleep(30000);
    }
}