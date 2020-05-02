#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <math.h>

#include "lcd_emulation.h"

void my_update();

int main(int argc, char ** argv){
	printf("%i", sizeof(unsigned short));
	LcdInitEmulation(argc, argv, my_update); /* This is BLOCKING! */
	return 0;
}

float angle = 0;
float angle1 = 0;
int radius = 100;
int radius1 = 50;

void my_update(){
	LcdClearColor(0x5555); //backgrund
	
	//draw some random color lines
	for(int i = 0; i < LCD_WIDTH/10; i++)
		LcdDrawLine(10*i, LCD_HEIGHT, LCD_HEIGHT, DIR_UP, (short) rand() * 0xFFFF);
	
	int x = LcdTouchX();
	int y = LcdTouchY();
	
	if(!(x < 0 || y < 0)){
		//draw a strange rectangle if there is a touch input
		LcdFillRect(x, y, 180, 80, 0x8989);
		LcdDrawRect2(x, y, 90, 40, 0x3454);
		LcdDrawRect2(x+90, y+40, 90, 40, 0x3454);	
	}
	
	//draw a line
	LcdDrawUniLine(LCD_WIDTH/2, LCD_HEIGHT/2, 0, 0, 0x1010);
	
	//draw two rotating lines
	LcdDrawUniLineRelative(LCD_WIDTH/2, LCD_HEIGHT/2, (int) radius*cosf(angle), (int) radius*sinf(angle), 0xF800);
	LcdDrawUniLineRelative(LCD_WIDTH/2 + (int) radius*cosf(angle), LCD_HEIGHT/2 + (int) radius*sinf(angle), (int) radius1*cosf(angle1), (int) radius1*sinf(angle1), 0xF800);
	
	LcdFlush(); //needed to force OpenGL to perform all the requested operations, must be called at the end of the drawing operations.

	//update angle
	angle1+=0.5f;
	angle+=0.1f;
	
	printf("Update excuted every %i milliseconds! Try to click on the screen and drag something!\n", LCD_UPDATE_PERIOD_MS);
	fflush(stdout); //needed otherwise printf would be delayed by glut
}
