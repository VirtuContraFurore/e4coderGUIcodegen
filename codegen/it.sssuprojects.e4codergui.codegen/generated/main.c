/*
 * main.c
 * Main file to run the gui and with the callbacks implementations
 */

#include <stdlib.h>
#include <stdbool.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"

#include "my_gui.h"

//forward decl of loop function
void loop();

int main(int argc, char ** argv){	
	WM_init(createWindow_MyFrame(), 1, 320, 240);
	WM_SCRIF_initEmulation(argc, argv, loop);
}

void loop(){
	WM_handleEvents();
    WM_update();
}

//Start of user code callbacks implementations

bool MyFrame_bottone1_onTouch(struct Widget *self, struct TouchEvent *event){
	struct buttonLed_Widget * data = (struct buttonLed_Widget *) MyFrame.widgets[MyFrame_BottoneColLed_IDX].data;
	data->isOn = !data->isOn;
	WM_Widget_redraw(&MyFrame.widgets[MyFrame_BottoneColLed_IDX]);
	return true;
}

bool MyFrame_bottone2_onTouch(struct Widget *self, struct TouchEvent *event){
	struct buttonLed_Widget * data = (struct buttonLed_Widget *) MyFrame.widgets[MyFrame_bottoneColLed2_IDX].data;
	data->isOn = !data->isOn;
	WM_Widget_redraw(&MyFrame.widgets[MyFrame_bottoneColLed2_IDX]);
	return true;
}

bool MyFrame_bottone3_onTouch(struct Widget *self, struct TouchEvent *event){
	struct buttonLed_Widget * data = (struct buttonLed_Widget *) MyFrame.widgets[MyFrame_BttoneColLed3_IDX].data;
	data->isOn = !data->isOn;
	WM_Widget_redraw(&MyFrame.widgets[MyFrame_BttoneColLed3_IDX]);
	return false;
}

bool MyFrame_BottoneColLed_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_bottoneColLed2_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_BttoneColLed3_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_BottoneColLed4_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_BottoneColLed5_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

//End of user code

