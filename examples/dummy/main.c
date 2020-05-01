#include <time.h>

#include "logging.h"

#include "core/windowmanager.h"
#include "widget/dummy.h"

int dummy_getTouchEvent(struct TouchEvent *event){
    LOG_INFO("Generated dummy touch event");
    return 1;
}

void dummy_drawPixel(struct Point p, struct Color c){
    LOG_INFO("Drew dummy pixel at (%d, %d)", p.x, p.y);
}

struct ScreenInterface dummy_interface = {
    .getTouchEvent = &dummy_getTouchEvent,
    .drawPixel = &dummy_drawPixel
};

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
    WM_init(&window, 1, &dummy_interface);
    while(1){
        WM_handleEvents();
        WM_update();
        usleep(30000);
    }
}