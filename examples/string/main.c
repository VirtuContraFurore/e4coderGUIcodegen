#include "logging.h"

#include "immagine.h"
#include "arial12.h"
#include "arial24.h"
#include "arial48.h"
#include "courier_new12.h"
#include "courier_new24.h"
#include "courier_new48.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"

#include "windowmanager/graphics/color.h"



void loop(){
    WM_handleEvents();
    WM_update();

    struct Point p = {0, 0};
    static bool fatto = false;

    if(!fatto){
      WM_SCRIF_drawBitmap(p, &bitmap_immagine);
      p.x = 10;
      WM_SCRIF_drawString(p, "ave!", &font_courier_new48px, RED);
      p.y = 100;
      WM_SCRIF_drawString(p, "satana!! f s", &font_arial48px, BLUE);
      fatto = true;
      WM_SCRIF_flush();
    }
}

int main(int argc, char ** argv){

  struct Window window = {
      .widgets = NULL,
      .n_widgets = 0,
      .background = BLACK
  };

  WM_init(&window, 1, 320, 240);
  WM_SCRIF_initEmulation(argc, argv, loop);


}
