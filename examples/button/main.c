#include <stdlib.h>
#include "logging.h"
#include "immagine.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/widget/button.h"
#include "windowmanager/widget/text.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/graphics/font.h"

#include "windowmanager/graphics/fonts/arial12.h"
#include "windowmanager/graphics/fonts/arial24.h"
#include "windowmanager/graphics/fonts/arial48.h"
#include "windowmanager/graphics/fonts/courier_new12.h"
#include "windowmanager/graphics/fonts/courier_new24.h"
#include "windowmanager/graphics/fonts/courier_new48.h"

struct Rect ret = {
    .pos = { 
        .x=50,
        .y=50
    },
    .w = 100,
    .h = 100
};


struct text_Widget testo;

struct button_Widget bottone;

struct Widget widgets[2];


struct Window window;

void loop(){
    WM_handleEvents();
    WM_update();
}

int count = 0;
bool m_onTouch(struct Widget *self, struct TouchEvent *event){
    sprintf(testo.initialText, "%d", ++count);
    LOG_INFO("Ya touch'd me! Arr. %d", count);
    LOG_DEBUG("%s", testo.initialText);
    LOG_DEBUG("%d", (int)widgets[1].redraw);
    widgetRedraw(&widgets[1]);
    LOG_DEBUG("%d", (int)widgets[1].redraw);
    return true;
}

int main(int argc, char ** argv){
    bottone.dim = ret;
    bottone.Image = bitmap_immagine;
    bottone.onTouch = m_onTouch;
    
    testo.backgroundColor = GREEN;
    testo.textColor = RED;
    testo.dim = (struct Rect){
        .pos = { 
            .x=50,
            .y=150
        },
        .w = 100,
        .h = 50
    };
    testo.font = &font_arial48px;
    testo.initialText = (char[50]){"0"};

    widgets[0].visible = true;
    widgets[0].funcs = &button_WidgetFunctions;
    widgets[0].data = (void*) &bottone;

    widgets[1].visible = true;
    widgets[1].funcs = &text_WidgetFunctions;
    widgets[1].data = (void*) &testo;

    window.widgets = widgets;
    window.n_widgets = 2;
    window.background = BLACK;

    WM_init(&window, 1, 320, 240);

    WM_SCRIF_initEmulation(argc, argv, loop);
}
