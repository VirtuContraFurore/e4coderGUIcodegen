#include <stdio.h>
#include <stdbool.h>

#include <GL/glew.h>
#include <GL/glut.h>

#include "lcdemulation/lcd_emulation.h"

static int last_x, last_y, pressed;
static void (*_mainFunc)();

//adjust x,y mapping to OpenGL window's coordinates (y start from top)
static inline void setCursor(int x, int y){
	glWindowPos2i(x,LCD_HEIGHT-1-y);
}

static void mainLoop(int value);
static void mouseKeyPress(int button, int state,int x, int y);
static void mouseMovement(int x, int y);

static void display(){}

void LcdInitEmulation(int argc, char ** argv, void (*mainFunc)()){
	printf("Starting LCD Emulation.\n");
	pressed = false;
	last_x = -1;
	last_y = -1;
	_mainFunc = mainFunc;

	glutInit(&argc, argv);

	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);

	glutInitWindowSize(LCD_WIDTH, LCD_HEIGHT);
	glutInitWindowPosition(100, 100);

	glutCreateWindow("STM32F4 Discovery Board LCD");

	glutMouseFunc(mouseKeyPress);
	glutMotionFunc(mouseMovement);
	glutDisplayFunc(display);
	glutTimerFunc(LCD_UPDATE_PERIOD_MS, mainLoop, 0);

	//initialize this library because glWindowPos is provided by glew.h
	glewInit();

	//Set pixel alignent to match format RGB_565 which is 2 = sizeof(unsigned short)
	glPixelStorei(GL_UNPACK_ALIGNMENT, sizeof(GLushort));

	glutMainLoop();
}

int LcdTouchX(){
	return last_x;
}

int LcdTouchY(){
	return last_y;
}

/*This will be called continuosly -- its our main loop*/
void mainLoop(int value){
	(*_mainFunc)();

	//try to avoid reshape
	if((glutGet(GLUT_WINDOW_WIDTH) != LCD_WIDTH) || (glutGet(GLUT_WINDOW_HEIGHT) != LCD_HEIGHT))
		glutReshapeWindow(LCD_WIDTH,LCD_HEIGHT);

	/*Set up the next event timer*/
	glutTimerFunc(LCD_UPDATE_PERIOD_MS, mainLoop, value);
}

void mouseKeyPress(int button, int state,int x, int y){
	if(button == 0){ //mouse left button
		//printf("Button %i, State %i, x %i, y %i\n", button, state, x, y);
		if(state == 0){
			pressed = true;
			last_x = x;
			last_y = y;
		} else {
			pressed = false;
			last_x = -1;
			last_y = -1;
		}
	}
}

void mouseMovement(int x, int y){
	if(pressed){
		//printf("Movement (%i,%i)",x,y);
		//if mouse left button is pressed we update the touch position
		last_x = x;
		last_y = y;
	}
}

void LcdFlush(){
	glFlush();
}

void LcdClear(){
	glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
	glClear(GL_COLOR_BUFFER_BIT);
}

void LcdClearColor(unsigned short color){
	float red = (float) (color>>11)/32;
	float green = (float) ((color>>5) & 0x3F)/64;
	float blue = (float) (color & 0x1F)/32;

	glClearColor(red, green, blue, 1.0f);
	glClear(GL_COLOR_BUFFER_BIT);
}

void LcdDrawLine(int x, int y, int lenght, enum LEMU_Direction direction, unsigned short color){
	GLushort * pixels = malloc(lenght*sizeof(GLushort));
	for(int i = 0; i<lenght; i++)
		pixels[i] = color;

	switch(direction){
	case DIR_UP:
		setCursor(x,y);
		glDrawPixels(1,lenght,GL_RGB, GL_UNSIGNED_SHORT_5_6_5,pixels);
		break;
	case DIR_DOWN:
		setCursor(x,y+lenght-1);
		glDrawPixels(1,lenght,GL_RGB, GL_UNSIGNED_SHORT_5_6_5,pixels);
		break;
	case DIR_RIGHT:
		setCursor(x,y);
		glDrawPixels(lenght,1,GL_RGB, GL_UNSIGNED_SHORT_5_6_5,pixels);
		break;
	case DIR_LEFT:
		setCursor(x-lenght+1,y);
		glDrawPixels(lenght,1,GL_RGB, GL_UNSIGNED_SHORT_5_6_5,pixels);
		break;
	}

	free(pixels);
}

void LcdFillRect(int x, int y, int w, int h, unsigned short color){
	GLushort * pixels = malloc(w*h*sizeof(GLushort));
	for(int i = 0; i<w*h; i++)
		pixels[i] = color;
	setCursor(x, y+h-1);
	glDrawPixels(w, h,GL_RGB, GL_UNSIGNED_SHORT_5_6_5,pixels);
	free(pixels);
}

void LcdDrawRect(int x, int y, int w, int h, unsigned short color){
	LcdDrawLine(x, y, w, DIR_RIGHT, color);
	LcdDrawLine(x, y+h-1, w, DIR_RIGHT, color);
	LcdDrawLine(x, y, h, DIR_DOWN, color);
	LcdDrawLine(x+w-1, y, h, DIR_DOWN, color);
}

void LcdDrawRect2(int x, int y, int w, int h, unsigned short color){
	LcdDrawRect(x, y, w, h, color);
	LcdDrawRect(x+1, y+1, w-2, h-2, color);
}

void LcdPutPixel(int x, int y, unsigned short color){
	setCursor(x, y);
	glDrawPixels(1, 1, GL_RGB, GL_UNSIGNED_SHORT_5_6_5, &color);
}

#define ABS(x) ((x>0) ? (x) : -(x))

void LcdDrawUniLine(int x1, int y1, int x2, int y2, unsigned short color)
{
  int deltax = 0, deltay = 0, x = 0, y = 0, xinc1 = 0, xinc2 = 0,
  yinc1 = 0, yinc2 = 0, den = 0, num = 0, numadd = 0, numpixels = 0,
  curpixel = 0;

  deltax = ABS(x2 - x1);        /* The difference between the x's */
  deltay = ABS(y2 - y1);        /* The difference between the y's */
  x = x1;                       /* Start x off at the first pixel */
  y = y1;                       /* Start y off at the first pixel */

  if (x2 >= x1)                 /* The x-values are increasing */
  {
    xinc1 = 1;
    xinc2 = 1;
  }
  else                          /* The x-values are decreasing */
  {
    xinc1 = -1;
    xinc2 = -1;
  }

  if (y2 >= y1)                 /* The y-values are increasing */
  {
    yinc1 = 1;
    yinc2 = 1;
  }
  else                          /* The y-values are decreasing */
  {
    yinc1 = -1;
    yinc2 = -1;
  }

  if (deltax >= deltay)         /* There is at least one x-value for every y-value */
  {
    xinc1 = 0;                  /* Don't change the x when numerator >= denominator */
    yinc2 = 0;                  /* Don't change the y for every iteration */
    den = deltax;
    num = deltax / 2;
    numadd = deltay;
    numpixels = deltax;         /* There are more x-values than y-values */
  }
  else                          /* There is at least one y-value for every x-value */
  {
    xinc2 = 0;                  /* Don't change the x for every iteration */
    yinc1 = 0;                  /* Don't change the y when numerator >= denominator */
    den = deltay;
    num = deltay / 2;
    numadd = deltax;
    numpixels = deltay;         /* There are more y-values than x-values */
  }

  for (curpixel = 0; curpixel <= numpixels; curpixel++)
  {
    LcdPutPixel(x, y, color);   /* Draw the current pixel */
    num += numadd;              /* Increase the numerator by the top of the fraction */
    if (num >= den)             /* Check if numerator >= denominator */
    {
      num -= den;               /* Calculate the new numerator value */
      x += xinc1;               /* Change the x as appropriate */
      y += yinc1;               /* Change the y as appropriate */
    }
    x += xinc2;                 /* Change the x as appropriate */
    y += yinc2;                 /* Change the y as appropriate */
  }
}

void LcdDrawUniLineRelative(int x, int y, int x_rel, int y_rel, unsigned short color){
	LcdDrawUniLine(x, y, x+x_rel-1, y+y_rel-1, color);
}

void LcdDrawBitmap(int x, int y, int w, int h, void * bitmap){
  short* arr = (short*) bitmap;
  GLushort * pixels = malloc((w * h) * sizeof(GLushort));

    //sam, porco dio, non sovrascrivere la visibilità dei parametri dento ai cicli
	for(int img_y = 0; img_y < h; img_y++)
		for(int img_x = 0; img_x < w; img_x++)
			  pixels[img_x + (h - 1 - img_y) * w] = arr[img_x + img_y * w];

    setCursor(x, y + h - 1);
    glDrawPixels(w, h, GL_RGB, GL_UNSIGNED_SHORT_5_6_5, pixels);

    free(pixels);
}

void LcdDrawChar(int x0, int y0, int w, int h, void* bitmap, unsigned short c){
  char* arr = (char*) bitmap;
  GLushort * pixels = malloc((8 * w) * sizeof(GLushort));
  int mask = 128, preX = -1;

  for(int i = 0; i < 8 * w; i++)
    pixels[i] = c;

  for(int y = 0; y < h; y++){
    for(int x = 0; x < w; x++){
      int a = (arr[(y * w + x) / 8] & mask) != 0;

      if(a && preX == -1){
        preX = x;
      }else if(preX != -1 && !a){
        setCursor(preX + x0, y + y0);
        glDrawPixels(x - preX, 1, GL_RGB, GL_UNSIGNED_SHORT_5_6_5, pixels);
        preX = -1;
      }

      mask >>= 1;
      mask = mask == 0 ? 128 : mask;
    }

    if(preX != -1){
      setCursor(preX + x0, y + y0);
      glDrawPixels(w - 1 - preX, 1, GL_RGB, GL_UNSIGNED_SHORT_5_6_5, pixels);
      preX = -1;
    }

  }

  free(pixels);
}

//void LcdDrawString(int x, int y, void * font, int charset, unsigned short color){}
