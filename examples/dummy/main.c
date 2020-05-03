#include <time.h>

#include "logging.h"

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/widget/dummy.h"

#include "windowmanager/graphics/color.h"


void m_dummy_onTouch(struct Widget *self, struct TouchEvent *event){
    LOG_INFO("Handled dummy touch event");
    self->redraw = true;
    WM_scheduleRedraw();

    if(event->type == SINGLE_TOUCH){
    	struct SingleTouchData * data = (struct SingleTouchData*) event->event_data;
    	struct Color color = (data->type == TOUCH_DOWN) ? RED : BLUE;
		WM_SCRIF_clearColor(color);
		WM_SCRIF_flush();
    }
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

void loop(){
    WM_handleEvents();
    WM_update();
}

int main(int argc, char ** argv){
    WM_init(&window, 1, 320, 240);

    WM_SCRIF_initEmulation(argc, argv, loop);
}

