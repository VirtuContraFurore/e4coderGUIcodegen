#include <time.h>

#include "logging.h"

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/widget/rectangle.h"

#include "windowmanager/graphics/color.h"

const struct Color colors[]={
    (struct Color){148, 0, 211, 255},
    (struct Color){75, 0, 130, 255},
    (struct Color){0, 0, 255, 255},
    (struct Color){0, 255, 0, 255},
    (struct Color){255, 255, 0, 255},
    (struct Color){255, 127, 0, 255},
    (struct Color){255, 0 , 0, 255}
};

int curr_idx[] = {0, 0, 0};
int tot_colors = 7;

struct Widget widgets[3];

int get_widget_idx(struct Widget *widget, struct Widget *widgets, int n){
    int i = 0;
    for (i; i < n; i++){
        if (widget == &(widgets[i]))
            return i;
    }
    return n;
}

bool m_rect_onTouch(struct Widget *self, struct TouchEvent *event){
    struct rectangle_WidgetData* data = (struct rectangle_WidgetData*) self->data;

    int i = get_widget_idx(self, widgets, 3);

    curr_idx[i] = (curr_idx[i] + 1) % tot_colors;
    data->color = colors[curr_idx[i]];
    
    self->redraw = true;
    WM_scheduleRedraw();

    return true;
}


void loop(){
    WM_handleEvents();
    WM_update();
}



int main(int argc, char ** argv){
    struct rectangle_WidgetData rectangle_widget_data1 = {
        .onTouch = &m_rect_onTouch,
        .rect = (struct Rect){
            .pos = (struct Point){.x = 10, .y = 10},
            .w = 100,
            .h = 100
        },
        .color = BLUE
    };

    struct Widget widget1 = {
        .visible = true,
        .funcs = &rectangle_WidgetFunctions,
        .data = (void*) &rectangle_widget_data1
    };

    struct rectangle_WidgetData rectangle_widget_data2 = {
        .onTouch = &m_rect_onTouch,
        .rect = (struct Rect){
            .pos = (struct Point){.x = 100, .y = 10},
            .w = 100,
            .h = 100
        },
        .color = RED
    };

    struct Widget widget2 = {
        .visible = true,
        .funcs = &rectangle_WidgetFunctions,
        .data = (void*) &rectangle_widget_data2
    };

    struct rectangle_WidgetData rectangle_widget_data3 = {
        .onTouch = &m_rect_onTouch,
        .rect = (struct Rect){
            .pos = (struct Point){.x = 50, .y = 10},
            .w = 100,
            .h = 100
        },
        .color = GREEN
    };

    struct Widget widget3 = {
        .visible = true,
        .funcs = &rectangle_WidgetFunctions,
        .data = (void*) &rectangle_widget_data3
    };

    widgets[0] = widget1;
    widgets[1] = widget2;
    widgets[2] = widget3;

    struct Window window = {
        .widgets = widgets,
        .n_widgets = 3
    };

    WM_init(&window, 1, 320, 240);

    WM_SCRIF_initEmulation(argc, argv, loop);
}

