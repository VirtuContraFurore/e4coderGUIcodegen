/*
 * my_gui.h
 * This code is auto generated from an xml file.
 */

#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"

#include "windowmanager/widget/buttonImage.h"
#include "windowmanager/widget/buttonLed.h"
#include "windowmanager/widget/knob.h"

/* Definitions for window named "MyFrame" */
extern struct Window MyFrame;

/* Indexes to retrieve widget using, e.g: "MyFrame.widgets[MyFrame_bottone1_IDX]" */
#define MyFrame_bottone1_IDX		 0
#define MyFrame_bottone2_IDX		 1
#define MyFrame_bottone3_IDX		 2
#define MyFrame_BottoneColLed_IDX		 3
#define MyFrame_BottoneColLed2_IDX		 4
#define MyFrame_BottoneColLed3_IDX		 5
#define MyFrame_IlMioRoller_IDX		 6

/* Initializes and returns Window struct for frame "MyFrame" */
struct Window * createWindow_MyFrame();

/* Callback functions for widgets */
bool MyFrame_bottone1_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_bottone2_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_bottone3_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BottoneColLed_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BottoneColLed2_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BottoneColLed3_onTouch(struct Widget *self, struct TouchEvent *event);
void MyFrame_IlMioRoller_onChange(struct Widget *self, float new_value, float old_value);

