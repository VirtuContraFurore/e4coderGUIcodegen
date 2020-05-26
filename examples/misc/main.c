#include "logging.h"

#include "needle.h"
#include "windowmanager/widget/needle.h"
#include "windowmanager/widget/knob.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"

#include "windowmanager/graphics/color.h"


struct needle_Widget needle;

struct knob_Widget knob;

struct Widget widgets[2];

void loop(){
    WM_handleEvents();
    WM_update();
}

void knob_onChange(struct Widget* self, float pre_val, float new_val){
  struct knob_Widget* data = (struct knob_Widget*) self->data;
  data->angle = new_val;
  needle.angle = new_val;
  WM_Widget_redrawAll(&widgets[0]);
}

int main(int argc, char ** argv){

  needle.image = bitmap_needle;
  needle.imagePosition.x = 120;
  needle.imagePosition.y = 100;
  needle.pivotPosition.x = 120;
  needle.pivotPosition.y = 15;
  needle.angle = 0;

  knob.image = bitmap_needle;
  knob.imagePosition.x = 120;
  knob.imagePosition.y = 200;
  knob.pivotPosition.x = 120;
  knob.pivotPosition.y = 15;
  knob.onChange = &knob_onChange;
  knob.angle = 0;

  widgets[0].visible = true;
  widgets[0].funcs = &needle_WidgetFunctions;
  widgets[0].data = (void*) &needle;

  widgets[1].visible = true;
  widgets[1].funcs = &knob_WidgetFunctions;
  widgets[1].data = (void*) &knob;

  struct Window window = {
      .widgets = widgets,
      .n_widgets = 2,
      .background = RED
  };

  WM_init(&window, 1, 320, 240);
  WM_SCRIF_initEmulation(argc, argv, loop);


}
