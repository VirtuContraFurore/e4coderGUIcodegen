#include "logging.h"

#include "needle.h"
#include "knob.h"
#include "windowmanager/widget/needle.h"
#include "windowmanager/widget/knob.h"
#include "windowmanager/widget/text.h"
#include "windowmanager/core/windowmanager.h"
#include "windowmanager/core/touch.h"

#include "windowmanager/graphics/fonts/arial12.h"
#include "windowmanager/graphics/fonts/arial24.h"
#include "windowmanager/graphics/fonts/arial48.h"

#include "windowmanager/graphics/color.h"

#define PI 3.1415926535

struct needle_Widget needle;

struct knob_Widget knob;

struct text_Widget text;

struct Widget widgets[3];

void loop(){
    WM_handleEvents();
    WM_update();
}

void knob_onChange(struct Widget* self, float pre_val, float new_val){
  struct knob_Widget* data = (struct knob_Widget*) self->data;

  float alpha = -new_val;
  if(alpha < 0){
    alpha = PI + pre_val > -pre_val ? 0 : PI;
  }

  data->angle = -alpha;
  needle.angle = -alpha;
  sprintf(text.initialText, "%d", (int)(100 * (alpha / PI)));
  WM_Widget_redrawAll(&widgets[0]);
}

int main(int argc, char ** argv){

  needle.image = bitmap_needle;
  needle.imagePosition.x = 120;
  needle.imagePosition.y = 100;
  needle.pivotPosition.x = 120;
  needle.pivotPosition.y = 15;
  needle.angle = 0;

  knob.image = bitmap_knob;
  knob.imagePosition.x = 120;
  knob.imagePosition.y = 200;
  knob.pivotPosition.x = 30;
  knob.pivotPosition.y = 30;
  knob.onChange = &knob_onChange;
  knob.angle = 0;


  text.backgroundColor = TRANSPARENT;
  text.textColor = BLACK;
  text.dim = (struct Rect){
      .pos = {
          .x = 160,
          .y = 175
      },
      .w = 100,
      .h = 50
  };
  text.font = &font_arial48px;
  text.initialText = (char[50]){"0"};

  widgets[0].visible = true;
  widgets[0].funcs = &needle_WidgetFunctions;
  widgets[0].data = (void*) &needle;

  widgets[1].visible = true;
  widgets[1].funcs = &knob_WidgetFunctions;
  widgets[1].data = (void*) &knob;

  widgets[2].visible = true;
  widgets[2].funcs = &text_WidgetFunctions;
  widgets[2].data = (void*) &text;

  struct Window window = {
      .widgets = widgets,
      .n_widgets = 3,
      .background = WHITE
  };

  WM_init(&window, 1, 320, 240);
  WM_SCRIF_initEmulation(argc, argv, loop);


}
