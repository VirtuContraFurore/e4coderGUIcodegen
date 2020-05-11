#include "logging.h"
#include "immagine.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/widget/button.h"
#include "windowmanager/graphics/color.h"




struct button_Widget *bottone;

struct Widget widget = {
    .visible = true,
    .funcs = &buttonWidgetFunctions,
    .data = (void*) &bottone
};

struct Window window = {
    .widgets = &widget,
    .n_widgets = 1,
    .background = BLACK
};

void loop(){
    WM_handleEvents();
    WM_update();
}

int main(int argc, char ** argv){

    bottone->dim.pos.x=50;
    bottone->dim.pos.y=50;
    bottone->dim.w=100;
    bottone->dim.h=100;
    bottone->Image=bitmap_immagine;

    WM_init(&window, 1, 320, 240);

    WM_SCRIF_initEmulation(argc, argv, loop);
}
