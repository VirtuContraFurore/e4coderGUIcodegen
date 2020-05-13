#include <stdlib.h>
#include "logging.h"
#include "immagine.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/widget/button.h"
#include "windowmanager/graphics/color.h"

struct Point const punto = {.x=50,.y=50};
struct Rect ret = {.pos=punto,.w=100,.h=100};

struct button_Widget* bottone;

struct WidgetFunctions buttonWidgetFunctions = {
    .draw = &buttonDraw,
    .onTouch = &buttonOnTouch,
};

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
    bottone = malloc(sizeof(*bottone));
    bottone->dim=ret;
    bottone->Image=bitmap_immagine;

    WM_init(&window, 1, 320, 240);

    WM_SCRIF_initEmulation(argc, argv, loop);
}
