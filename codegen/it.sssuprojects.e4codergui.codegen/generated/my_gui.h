/*
 * my_gui.h
 * This code is auto generated from an xml file.
 */

#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"

#include "windowmanager/widget/buttonImage.h"
#include "windowmanager/widget/buttonLed.h"

/* Definitions for window named "MyFrame" */
extern struct Window MyFrame;

/* Indexes to retrieve widget using, e.g: "MyFrame.widgets[MyFrame_bottone1_IDX]" */
#define MyFrame_bottone1_IDX		 0
#define MyFrame_bottone2_IDX		 1
#define MyFrame_bottone3_IDX		 2
#define MyFrame_BottoneColLed_IDX		 3
#define MyFrame_bottoneColLed2_IDX		 4
#define MyFrame_BttoneColLed3_IDX		 5
#define MyFrame_BottoneColLed4_IDX		 6
#define MyFrame_BottoneColLed5_IDX		 7

/* Initializes and returns Window struct for frame "MyFrame" */
struct Window * createWindow_MyFrame();

/* Callback functions for widgets */
bool MyFrame_bottone1_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_bottone2_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_bottone3_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BottoneColLed_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_bottoneColLed2_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BttoneColLed3_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BottoneColLed4_onTouch(struct Widget *self, struct TouchEvent *event);
bool MyFrame_BottoneColLed5_onTouch(struct Widget *self, struct TouchEvent *event);

