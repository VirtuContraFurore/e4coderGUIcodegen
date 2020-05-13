#ifndef COLOR_H
#define COLOR_H

struct Color{
  unsigned char r;
  unsigned char g;
  unsigned char b;
  unsigned char a;
};

#define RED (struct Color){.r = 255, .g = 0, .b = 0, .a = 0}
#define GREEN (struct Color){.r = 0, .g = 255, .b = 0, .a = 0}
#define BLUE (struct Color){.r = 0, .g = 0, .b = 255, .a = 0}
#define BLACK (struct Color){.r = 0, .g = 0, .b = 0, .a = 0}
#define WHITE (struct Color){.r = 255, .g = 255, .b = 255, .a = 0}
#define TRANSPARENT (struct Color){.r = 0, .g = 0, .b = 0, .a = 255}

#define TO_565(color) ((unsigned short) (((0xF8 & (color).r)<<8) | ((0xFC & (color).g)<<3) | ((0xF8 & (color).b)>>3)))
#endif
