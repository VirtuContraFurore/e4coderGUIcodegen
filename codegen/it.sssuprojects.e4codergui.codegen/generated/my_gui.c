/*
 * my_gui.c
 * This code is auto generated from an xml file.
 */

#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/widget/buttonImage.h"
#include "windowmanager/widget/buttonLed.h"

#include "my_gui.h"
#include "my_images.h"

/* Code for frame "MyFrame" */

struct Window MyFrame;
struct Widget MyFrame_widgets[8];
struct buttonImage_Widget MyFrame_bottone1_pdata;
struct buttonImage_Widget MyFrame_bottone2_pdata;
struct buttonImage_Widget MyFrame_bottone3_pdata;
struct buttonLed_Widget MyFrame_BottoneColLed_pdata;
struct buttonLed_Widget MyFrame_bottoneColLed2_pdata;
struct buttonLed_Widget MyFrame_BttoneColLed3_pdata;
struct buttonLed_Widget MyFrame_BottoneColLed4_pdata;
struct buttonLed_Widget MyFrame_BottoneColLed5_pdata;

struct Window * createWindow_MyFrame(){
	struct Window * window = &MyFrame;   //window's struct alias 
	struct Widget * widgets = MyFrame_widgets;   //widgets' array alias

	// Initialization of widget "bottone1"
	MyFrame_bottone1_pdata.dim.pos.x = 15;
	MyFrame_bottone1_pdata.dim.pos.y = 78;
	MyFrame_bottone1_pdata.dim.w = 109;
	MyFrame_bottone1_pdata.dim.h = 29;
	MyFrame_bottone1_pdata.onTouch = &MyFrame_bottone1_onTouch;
	MyFrame_bottone1_pdata.isPressed = false;
	MyFrame_bottone1_pdata.pressedImage.bmp = Image_MyFrame_bottone1_pressed_bitmap;
	MyFrame_bottone1_pdata.pressedImage.alpha = 0; //no alpha here
	MyFrame_bottone1_pdata.pressedImage.width = IMAGE_MYFRAME_BOTTONE1_PRESSED_WIDTH;
	MyFrame_bottone1_pdata.pressedImage.height = IMAGE_MYFRAME_BOTTONE1_PRESSED_HEIGHT;
	MyFrame_bottone1_pdata.releasedImage.bmp = Image_MyFrame_bottone1_released_bitmap;
	MyFrame_bottone1_pdata.releasedImage.alpha = 0; //no alpha here
	MyFrame_bottone1_pdata.releasedImage.width = IMAGE_MYFRAME_BOTTONE1_RELEASED_WIDTH;
	MyFrame_bottone1_pdata.releasedImage.height = IMAGE_MYFRAME_BOTTONE1_RELEASED_HEIGHT;
	widgets[0].visible = true;
	widgets[0].funcs = &buttonImage_WidgetFunctions;
	widgets[0].data = (void*) &MyFrame_bottone1_pdata;

	// Initialization of widget "bottone2"
	MyFrame_bottone2_pdata.dim.pos.x = 15;
	MyFrame_bottone2_pdata.dim.pos.y = 126;
	MyFrame_bottone2_pdata.dim.w = 109;
	MyFrame_bottone2_pdata.dim.h = 29;
	MyFrame_bottone2_pdata.onTouch = &MyFrame_bottone2_onTouch;
	MyFrame_bottone2_pdata.isPressed = false;
	MyFrame_bottone2_pdata.pressedImage.bmp = Image_MyFrame_bottone2_pressed_bitmap;
	MyFrame_bottone2_pdata.pressedImage.alpha = 0; //no alpha here
	MyFrame_bottone2_pdata.pressedImage.width = IMAGE_MYFRAME_BOTTONE2_PRESSED_WIDTH;
	MyFrame_bottone2_pdata.pressedImage.height = IMAGE_MYFRAME_BOTTONE2_PRESSED_HEIGHT;
	MyFrame_bottone2_pdata.releasedImage.bmp = Image_MyFrame_bottone2_released_bitmap;
	MyFrame_bottone2_pdata.releasedImage.alpha = 0; //no alpha here
	MyFrame_bottone2_pdata.releasedImage.width = IMAGE_MYFRAME_BOTTONE2_RELEASED_WIDTH;
	MyFrame_bottone2_pdata.releasedImage.height = IMAGE_MYFRAME_BOTTONE2_RELEASED_HEIGHT;
	widgets[1].visible = true;
	widgets[1].funcs = &buttonImage_WidgetFunctions;
	widgets[1].data = (void*) &MyFrame_bottone2_pdata;

	// Initialization of widget "bottone3"
	MyFrame_bottone3_pdata.dim.pos.x = 15;
	MyFrame_bottone3_pdata.dim.pos.y = 175;
	MyFrame_bottone3_pdata.dim.w = 109;
	MyFrame_bottone3_pdata.dim.h = 29;
	MyFrame_bottone3_pdata.onTouch = &MyFrame_bottone3_onTouch;
	MyFrame_bottone3_pdata.isPressed = false;
	MyFrame_bottone3_pdata.pressedImage.bmp = Image_MyFrame_bottone3_pressed_bitmap;
	MyFrame_bottone3_pdata.pressedImage.alpha = 0; //no alpha here
	MyFrame_bottone3_pdata.pressedImage.width = IMAGE_MYFRAME_BOTTONE3_PRESSED_WIDTH;
	MyFrame_bottone3_pdata.pressedImage.height = IMAGE_MYFRAME_BOTTONE3_PRESSED_HEIGHT;
	MyFrame_bottone3_pdata.releasedImage.bmp = Image_MyFrame_bottone3_released_bitmap;
	MyFrame_bottone3_pdata.releasedImage.alpha = 0; //no alpha here
	MyFrame_bottone3_pdata.releasedImage.width = IMAGE_MYFRAME_BOTTONE3_RELEASED_WIDTH;
	MyFrame_bottone3_pdata.releasedImage.height = IMAGE_MYFRAME_BOTTONE3_RELEASED_HEIGHT;
	widgets[2].visible = true;
	widgets[2].funcs = &buttonImage_WidgetFunctions;
	widgets[2].data = (void*) &MyFrame_bottone3_pdata;

	// Initialization of widget "BottoneColLed"
	MyFrame_BottoneColLed_pdata.dim.pos.x = 89;
	MyFrame_BottoneColLed_pdata.dim.pos.y = 22;
	MyFrame_BottoneColLed_pdata.dim.w = 109;
	MyFrame_BottoneColLed_pdata.dim.h = 29;
	MyFrame_BottoneColLed_pdata.onTouch = &MyFrame_BottoneColLed_onTouch;
	MyFrame_BottoneColLed_pdata.isPressed = false;
	MyFrame_BottoneColLed_pdata.isOn = false;
	MyFrame_BottoneColLed_pdata.pressedOnImage.bmp = Image_MyFrame_BottoneColLed_pressed_on_bitmap;
	MyFrame_BottoneColLed_pdata.pressedOnImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed_pdata.pressedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED_PRESSED_ON_WIDTH;
	MyFrame_BottoneColLed_pdata.pressedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED_PRESSED_ON_HEIGHT;
	MyFrame_BottoneColLed_pdata.releasedOnImage.bmp = Image_MyFrame_BottoneColLed_released_on_bitmap;
	MyFrame_BottoneColLed_pdata.releasedOnImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed_pdata.releasedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED_RELEASED_ON_WIDTH;
	MyFrame_BottoneColLed_pdata.releasedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED_RELEASED_ON_HEIGHT;
	MyFrame_BottoneColLed_pdata.pressedOffImage.bmp = Image_MyFrame_BottoneColLed_pressed_off_bitmap;
	MyFrame_BottoneColLed_pdata.pressedOffImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed_pdata.pressedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED_PRESSED_OFF_WIDTH;
	MyFrame_BottoneColLed_pdata.pressedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED_PRESSED_OFF_HEIGHT;
	MyFrame_BottoneColLed_pdata.releasedOffImage.bmp = Image_MyFrame_BottoneColLed_released_off_bitmap;
	MyFrame_BottoneColLed_pdata.releasedOffImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed_pdata.releasedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED_RELEASED_OFF_WIDTH;
	MyFrame_BottoneColLed_pdata.releasedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED_RELEASED_OFF_HEIGHT;
	widgets[3].visible = true;
	widgets[3].funcs = &buttonLed_WidgetFunctions;
	widgets[3].data = (void*) &MyFrame_BottoneColLed_pdata;

	// Initialization of widget "bottoneColLed2"
	MyFrame_bottoneColLed2_pdata.dim.pos.x = 158;
	MyFrame_bottoneColLed2_pdata.dim.pos.y = 85;
	MyFrame_bottoneColLed2_pdata.dim.w = 109;
	MyFrame_bottoneColLed2_pdata.dim.h = 29;
	MyFrame_bottoneColLed2_pdata.onTouch = &MyFrame_bottoneColLed2_onTouch;
	MyFrame_bottoneColLed2_pdata.isPressed = false;
	MyFrame_bottoneColLed2_pdata.isOn = false;
	MyFrame_bottoneColLed2_pdata.pressedOnImage.bmp = Image_MyFrame_bottoneColLed2_pressed_on_bitmap;
	MyFrame_bottoneColLed2_pdata.pressedOnImage.alpha = 0; //no alpha here
	MyFrame_bottoneColLed2_pdata.pressedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED2_PRESSED_ON_WIDTH;
	MyFrame_bottoneColLed2_pdata.pressedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED2_PRESSED_ON_HEIGHT;
	MyFrame_bottoneColLed2_pdata.releasedOnImage.bmp = Image_MyFrame_bottoneColLed2_released_on_bitmap;
	MyFrame_bottoneColLed2_pdata.releasedOnImage.alpha = 0; //no alpha here
	MyFrame_bottoneColLed2_pdata.releasedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED2_RELEASED_ON_WIDTH;
	MyFrame_bottoneColLed2_pdata.releasedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED2_RELEASED_ON_HEIGHT;
	MyFrame_bottoneColLed2_pdata.pressedOffImage.bmp = Image_MyFrame_bottoneColLed2_pressed_off_bitmap;
	MyFrame_bottoneColLed2_pdata.pressedOffImage.alpha = 0; //no alpha here
	MyFrame_bottoneColLed2_pdata.pressedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED2_PRESSED_OFF_WIDTH;
	MyFrame_bottoneColLed2_pdata.pressedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED2_PRESSED_OFF_HEIGHT;
	MyFrame_bottoneColLed2_pdata.releasedOffImage.bmp = Image_MyFrame_bottoneColLed2_released_off_bitmap;
	MyFrame_bottoneColLed2_pdata.releasedOffImage.alpha = 0; //no alpha here
	MyFrame_bottoneColLed2_pdata.releasedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED2_RELEASED_OFF_WIDTH;
	MyFrame_bottoneColLed2_pdata.releasedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED2_RELEASED_OFF_HEIGHT;
	widgets[4].visible = true;
	widgets[4].funcs = &buttonLed_WidgetFunctions;
	widgets[4].data = (void*) &MyFrame_bottoneColLed2_pdata;

	// Initialization of widget "BttoneColLed3"
	MyFrame_BttoneColLed3_pdata.dim.pos.x = 194;
	MyFrame_BttoneColLed3_pdata.dim.pos.y = 126;
	MyFrame_BttoneColLed3_pdata.dim.w = 109;
	MyFrame_BttoneColLed3_pdata.dim.h = 29;
	MyFrame_BttoneColLed3_pdata.onTouch = &MyFrame_BttoneColLed3_onTouch;
	MyFrame_BttoneColLed3_pdata.isPressed = false;
	MyFrame_BttoneColLed3_pdata.isOn = false;
	MyFrame_BttoneColLed3_pdata.pressedOnImage.bmp = Image_MyFrame_BttoneColLed3_pressed_on_bitmap;
	MyFrame_BttoneColLed3_pdata.pressedOnImage.alpha = 0; //no alpha here
	MyFrame_BttoneColLed3_pdata.pressedOnImage.width = IMAGE_MYFRAME_BTTONECOLLED3_PRESSED_ON_WIDTH;
	MyFrame_BttoneColLed3_pdata.pressedOnImage.height = IMAGE_MYFRAME_BTTONECOLLED3_PRESSED_ON_HEIGHT;
	MyFrame_BttoneColLed3_pdata.releasedOnImage.bmp = Image_MyFrame_BttoneColLed3_released_on_bitmap;
	MyFrame_BttoneColLed3_pdata.releasedOnImage.alpha = 0; //no alpha here
	MyFrame_BttoneColLed3_pdata.releasedOnImage.width = IMAGE_MYFRAME_BTTONECOLLED3_RELEASED_ON_WIDTH;
	MyFrame_BttoneColLed3_pdata.releasedOnImage.height = IMAGE_MYFRAME_BTTONECOLLED3_RELEASED_ON_HEIGHT;
	MyFrame_BttoneColLed3_pdata.pressedOffImage.bmp = Image_MyFrame_BttoneColLed3_pressed_off_bitmap;
	MyFrame_BttoneColLed3_pdata.pressedOffImage.alpha = 0; //no alpha here
	MyFrame_BttoneColLed3_pdata.pressedOffImage.width = IMAGE_MYFRAME_BTTONECOLLED3_PRESSED_OFF_WIDTH;
	MyFrame_BttoneColLed3_pdata.pressedOffImage.height = IMAGE_MYFRAME_BTTONECOLLED3_PRESSED_OFF_HEIGHT;
	MyFrame_BttoneColLed3_pdata.releasedOffImage.bmp = Image_MyFrame_BttoneColLed3_released_off_bitmap;
	MyFrame_BttoneColLed3_pdata.releasedOffImage.alpha = 0; //no alpha here
	MyFrame_BttoneColLed3_pdata.releasedOffImage.width = IMAGE_MYFRAME_BTTONECOLLED3_RELEASED_OFF_WIDTH;
	MyFrame_BttoneColLed3_pdata.releasedOffImage.height = IMAGE_MYFRAME_BTTONECOLLED3_RELEASED_OFF_HEIGHT;
	widgets[5].visible = true;
	widgets[5].funcs = &buttonLed_WidgetFunctions;
	widgets[5].data = (void*) &MyFrame_BttoneColLed3_pdata;

	// Initialization of widget "BottoneColLed4"
	MyFrame_BottoneColLed4_pdata.dim.pos.x = 150;
	MyFrame_BottoneColLed4_pdata.dim.pos.y = 173;
	MyFrame_BottoneColLed4_pdata.dim.w = 109;
	MyFrame_BottoneColLed4_pdata.dim.h = 29;
	MyFrame_BottoneColLed4_pdata.onTouch = &MyFrame_BottoneColLed4_onTouch;
	MyFrame_BottoneColLed4_pdata.isPressed = false;
	MyFrame_BottoneColLed4_pdata.isOn = false;
	MyFrame_BottoneColLed4_pdata.pressedOnImage.bmp = Image_MyFrame_BottoneColLed4_pressed_on_bitmap;
	MyFrame_BottoneColLed4_pdata.pressedOnImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed4_pdata.pressedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED4_PRESSED_ON_WIDTH;
	MyFrame_BottoneColLed4_pdata.pressedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED4_PRESSED_ON_HEIGHT;
	MyFrame_BottoneColLed4_pdata.releasedOnImage.bmp = Image_MyFrame_BottoneColLed4_released_on_bitmap;
	MyFrame_BottoneColLed4_pdata.releasedOnImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed4_pdata.releasedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED4_RELEASED_ON_WIDTH;
	MyFrame_BottoneColLed4_pdata.releasedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED4_RELEASED_ON_HEIGHT;
	MyFrame_BottoneColLed4_pdata.pressedOffImage.bmp = Image_MyFrame_BottoneColLed4_pressed_off_bitmap;
	MyFrame_BottoneColLed4_pdata.pressedOffImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed4_pdata.pressedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED4_PRESSED_OFF_WIDTH;
	MyFrame_BottoneColLed4_pdata.pressedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED4_PRESSED_OFF_HEIGHT;
	MyFrame_BottoneColLed4_pdata.releasedOffImage.bmp = Image_MyFrame_BottoneColLed4_released_off_bitmap;
	MyFrame_BottoneColLed4_pdata.releasedOffImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed4_pdata.releasedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED4_RELEASED_OFF_WIDTH;
	MyFrame_BottoneColLed4_pdata.releasedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED4_RELEASED_OFF_HEIGHT;
	widgets[6].visible = true;
	widgets[6].funcs = &buttonLed_WidgetFunctions;
	widgets[6].data = (void*) &MyFrame_BottoneColLed4_pdata;

	// Initialization of widget "BottoneColLed5"
	MyFrame_BottoneColLed5_pdata.dim.pos.x = 89;
	MyFrame_BottoneColLed5_pdata.dim.pos.y = 209;
	MyFrame_BottoneColLed5_pdata.dim.w = 109;
	MyFrame_BottoneColLed5_pdata.dim.h = 29;
	MyFrame_BottoneColLed5_pdata.onTouch = &MyFrame_BottoneColLed5_onTouch;
	MyFrame_BottoneColLed5_pdata.isPressed = false;
	MyFrame_BottoneColLed5_pdata.isOn = false;
	MyFrame_BottoneColLed5_pdata.pressedOnImage.bmp = Image_MyFrame_BottoneColLed5_pressed_on_bitmap;
	MyFrame_BottoneColLed5_pdata.pressedOnImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed5_pdata.pressedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED5_PRESSED_ON_WIDTH;
	MyFrame_BottoneColLed5_pdata.pressedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED5_PRESSED_ON_HEIGHT;
	MyFrame_BottoneColLed5_pdata.releasedOnImage.bmp = Image_MyFrame_BottoneColLed5_released_on_bitmap;
	MyFrame_BottoneColLed5_pdata.releasedOnImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed5_pdata.releasedOnImage.width = IMAGE_MYFRAME_BOTTONECOLLED5_RELEASED_ON_WIDTH;
	MyFrame_BottoneColLed5_pdata.releasedOnImage.height = IMAGE_MYFRAME_BOTTONECOLLED5_RELEASED_ON_HEIGHT;
	MyFrame_BottoneColLed5_pdata.pressedOffImage.bmp = Image_MyFrame_BottoneColLed5_pressed_off_bitmap;
	MyFrame_BottoneColLed5_pdata.pressedOffImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed5_pdata.pressedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED5_PRESSED_OFF_WIDTH;
	MyFrame_BottoneColLed5_pdata.pressedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED5_PRESSED_OFF_HEIGHT;
	MyFrame_BottoneColLed5_pdata.releasedOffImage.bmp = Image_MyFrame_BottoneColLed5_released_off_bitmap;
	MyFrame_BottoneColLed5_pdata.releasedOffImage.alpha = 0; //no alpha here
	MyFrame_BottoneColLed5_pdata.releasedOffImage.width = IMAGE_MYFRAME_BOTTONECOLLED5_RELEASED_OFF_WIDTH;
	MyFrame_BottoneColLed5_pdata.releasedOffImage.height = IMAGE_MYFRAME_BOTTONECOLLED5_RELEASED_OFF_HEIGHT;
	widgets[7].visible = true;
	widgets[7].funcs = &buttonLed_WidgetFunctions;
	widgets[7].data = (void*) &MyFrame_BottoneColLed5_pdata;

    //setting window frame properties
	window->widgets = widgets;
	window->n_widgets = 8;
	window->background = WHITE;
	return window;
}

/* end code for frame "MyFrame" */
