#ifndef COLOR_H
#define COLOR_H

struct Color{
  unsigned char r;
  unsigned char g;
  unsigned char b;
  unsigned char a;
};

#define RED (Color){.r = 255, .g = 0, .b = 0, .a = 0}
#define GREEN (Color){.r = 0, .g = 255, .b = 0, .a = 0}
#define BLUE (Color){.r = 0, .g = 0, .b = 255, .a = 0}
#define BLACK (Color){.r = 0, .g = 0, .b = 0, .a = 0}
#define WHITE (Color){.r = 255, .g = 255, .b = 255, .a = 0}
#define TRANSPARENT (Color){.r = 0, .g = 0, .b = 255, .a = 0}

inline unsigned short int to565(struct Color c){
  return (unsigned short) (
    (0b1111100000000000 & c.r) |
    (0b0000011111100000 & c.g) |
    (0b0000000000011111 & c.b)
    );
}
#endif