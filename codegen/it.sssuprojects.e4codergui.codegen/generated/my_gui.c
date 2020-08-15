/*
 * my_gui.c
 * This code is auto generated from an xml file.
 */

#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"

/* Code for frame "MyFrame" */

struct Window MyFrame;
struct Widget MyFrame_widgets[3];
struct dummy_WidgetData MyFrame_rotella1_pdata;
struct dummy_WidgetData MyFrame_botton2_pdata;
struct button_WidgetData MyFrame_bottone1_pdata;

void struct Window * createWindow_MyFrame(){
	struct Window * window = &MyFrame;   //window's struct alias 
	Widget * widgets = MyFrame_widgets;   //widgets' array alias

	// Initialization of widget "rotella1"
	MyFrame_rotella1_pdata.fieldXXX = 1;
	MyFrame_rotella1_pdata.fieldXXX = 2;
	widgets[0].visible = true;
	widgets[0].funcs = &dummy_WidgetFunctions;
	widgets[0].data = (void*) &MyFrame_rotella1_pdata;

	// Initialization of widget "botton2"
	MyFrame_botton2_pdata.fieldXXX = 1;
	MyFrame_botton2_pdata.fieldXXX = 2;
	widgets[1].visible = true;
	widgets[1].funcs = &dummy_WidgetFunctions;
	widgets[1].data = (void*) &MyFrame_botton2_pdata;

	// Initialization of widget "bottone1"
	MyFrame_bottone1_pdata.fieldXXX = 1;
	MyFrame_bottone1_pdata.fieldXXX = 2;
	widgets[2].visible = true;
	widgets[2].funcs = &button_WidgetFunctions;
	widgets[2].data = (void*) &MyFrame_bottone1_pdata;

    //setting window frame properties
	window->widgets = widgets;
	window->n_widgets = 3;
	window->background = WHITE;
	return window;
}

/* end code for frame "MyFrame" */
