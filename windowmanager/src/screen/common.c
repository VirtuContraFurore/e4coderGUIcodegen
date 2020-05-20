#include <stdbool.h>
#include <stddef.h>

#include "logging.h"

#include "windowmanager/core/screeninterface.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/graphics/bitmap.h"
#include "windowmanager/graphics/font.h"

void WM_SCRIF_drawBitmap(struct Point pos, struct Bitmap* bitmap){
	const unsigned short* arr = bitmap->bmp;
	const unsigned char* alpha = bitmap->alpha;
	int index = 0;
	int mask = 1<<7;

	for(int y = pos.y; y < pos.y+bitmap->height; y++)
		for(int x = pos.x; x < pos.x+bitmap->width; x++){
				if(alpha==0 || (alpha[index] & mask))
					WM_SCRIF_drawPixelRaw(x,y, arr[(x-pos.x) + (y-pos.y)*bitmap->width]);

				mask>>=1;
				if(mask == 0){
					mask = 1<<7;
					index++;
				}
		}
}

void WM_SCRIF_drawRotateBitmap(struct Point pos, struct Bitmap* bitmap, struct Point axis, float angle){
  int i, j;
  short color;
  unsigned char mask = 1;
  float cosA, sinA, x0, y0;

  cosA = cos(angle);
  sinA = sin(angle);

  x0 = (-1-axis.x) * cosA - (-axis.y) * sinA + pos.x;
  y0 = (-1-axis.x) * sinA + (-axis.y) * cosA + pos.y;

  for(i = 0; i < bitmap->height; i++){
    float left_x = x0, left_y = y0;

    x0 -= sinA;
    y0 += cosA;

    for(j = 0; j < bitmap->width; j++){
      float down_x, down_y, x, y;
      bool alpha;

      mask = (mask == 1) ? 128 : (mask >> 1);

      color = bitmap->bmp[i * bitmap->width + j];

      x = left_x + cosA;
      y = left_y + sinA;

      down_x = x - sinA;
      down_y = y + cosA;

      alpha = (bitmap->alpha[(i * bitmap->width + j) / 8] & mask);

      if(alpha){
        int l_x = left_x, f_x = x, d_x = down_x, l_y = left_y, f_y = y, d_y = down_y;
        if((l_x != f_x || l_y != f_y) && (d_x != f_x || d_y != f_y)){
        	WM_SCRIF_drawPixelRaw(f_x, f_y, color);
        	WM_SCRIF_drawPixelRaw(f_x+1, f_y, color);
        	WM_SCRIF_drawPixelRaw(f_x, f_y+1, color);
        }
      }
      left_x = x;
      left_y = y;
    }
  }
}

void WM_SCRIF_drawChar(struct Rect rect, const unsigned char * font, struct Color c){
	int mask = 128, preX = -1;
	unsigned short color = TO_565(c);

	for(int y = 0; y < rect.h; y++){
		for(int x = 0; x < rect.w; x++){
			if(font[(y * rect.w + x) / 8] & mask)
				WM_SCRIF_drawPixelRaw(x+rect.pos.x, y+rect.pos.y, color);
			mask >>= 1;
			mask = (mask == 0) ? 128 : mask;
		}
	}
}

void WM_SCRIF_drawString(struct Point pos, char* string, struct Font* font, struct Color c){
    int i = 0;

    while(string[i] != '\0'){
      /* Manage space char */
      if(string[i] == ' '){
    	  pos.x +=font->symbols[(int)'a'-33].width; /* Use the same width of 'a' character. */
    	  i++;
    	  continue;
      }

      int index = (int)string[i] - 33;

      struct Rect rect = {.pos=pos, .w = font->symbols[index].width, .h = font->symbols[index].height};

      WM_SCRIF_drawChar(rect, font->symbols[index].data, c);

      pos.x += rect.w;
      i++;
    }
}



