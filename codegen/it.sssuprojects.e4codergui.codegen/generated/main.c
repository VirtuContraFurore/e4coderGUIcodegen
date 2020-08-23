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
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_bottone2_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_bottone3_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_BottoneColLed_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_BottoneColLed2_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

bool MyFrame_BottoneColLed3_onTouch(struct Widget *self, struct TouchEvent *event){
	//TODO: return true if the touch event was processed by this button
	return false;
}

void MyFrame_IlMioRoller_onChange(struct Widget *self, float new_value, float old_value){
	//TODO: write the body of the callback for this knob
}

//End of user code

