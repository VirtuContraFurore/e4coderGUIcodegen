#include "logging.h"

#include "immagine.h"
#include "windowmanager/graphics/fonts/arial12.h"
#include "windowmanager/graphics/fonts/arial24.h"
#include "windowmanager/graphics/fonts/arial48.h"
#include "windowmanager/graphics/fonts/courier_new12.h"
#include "windowmanager/graphics/fonts/courier_new24.h"
#include "windowmanager/graphics/fonts/courier_new48.h"
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
      p = (struct Point) {20, 20};
      WM_SCRIF_drawString(p, "ave!", &font_courier_new48px, BLACK);
      p = (struct Point) {20+1, 20-1};
      WM_SCRIF_drawString(p, "ave!", &font_courier_new48px, BLACK);
      p = (struct Point) {20+2, 20-2};
      WM_SCRIF_drawString(p, "ave!", &font_courier_new48px, RED);
      p = (struct Point) {140, 180};
      WM_SCRIF_drawString(p, "satana!!", &font_arial48px, BLACK);
      p = (struct Point) {140+1, 180-1};
      WM_SCRIF_drawString(p, "satana!!", &font_arial48px, BLACK);
      p = (struct Point) {140+2, 180-2};
      WM_SCRIF_drawString(p, "satana!!", &font_arial48px, BLUE);
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
