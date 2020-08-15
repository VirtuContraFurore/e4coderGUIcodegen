/*
 * my_gui.c
 * This code is auto generated from an xml file.
 */

#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"

#include "my_gui.h"
#include "my_images.h"

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
	dummy
	widgets[0].visible = true;
	widgets[0].funcs = &dummy_WidgetFunctions;
	widgets[0].data = (void*) &MyFrame_rotella1_pdata;

	// Initialization of widget "botton2"
	dummy
	widgets[1].visible = true;
	widgets[1].funcs = &dummy_WidgetFunctions;
	widgets[1].data = (void*) &MyFrame_botton2_pdata;

	// Initialization of widget "bottone1"
	MyFrame_bottone1_pdata.dim.pos.x = 34;
	MyFrame_bottone1_pdata.dim.pos.y = 56;
	MyFrame_bottone1_pdata.dim.w = 109;
	MyFrame_bottone1_pdata.dim.h = 29;
	MyFrame_bottone1_pdata.onTouch = &MyFrame_bottone1_onTouch;
	MyFrame_bottone1_pdata.Image.bmp = Image_MyFrame_bottone1_OFF_bitmap; //TODO: img must be declared outside...
	MyFrame_bottone1_pdata.Image.alpha = 0; //no alpha here
	MyFrame_bottone1_pdata.Image.width = IMAGE_MYFRAME_BOTTONE1_OFF_WIDTH; //TODO
	MyFrame_bottone1_pdata.Image.hight = IMAGE_MYFRAME_BOTTONE1_OFF_HEIGHT; //TODO
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
