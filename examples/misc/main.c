#include "logging.h"

#include "needle.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"

#include "windowmanager/graphics/color.h"



void loop(){
    WM_handleEvents();
    WM_update();

    struct Point p = {160, 120}, axis = {bitmap_needle.width / 2, bitmap_needle.height / 2};
    static float angle = 0;
    angle += 0.05;
    WM_SCRIF_clear();
    WM_SCRIF_drawRotateBitmap(p, &bitmap_needle, axis, angle);
    WM_SCRIF_flush();
}

int main(int argc, char ** argv){

  struct Window window = {
      .widgets = NULL,
      .n_widgets = 0,
      .background = RED
  };

  WM_init(&window, 1, 320, 240);
  WM_SCRIF_initEmulation(argc, argv, loop);


}
