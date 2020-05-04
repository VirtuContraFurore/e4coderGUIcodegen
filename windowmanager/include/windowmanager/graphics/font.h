#ifndef FONT_H
#define FONT_H

struct Character{
  const unsigned char *data;
  int width, height;
};
struct Font {
    const struct Character *symbols;
    int size;
};

#endif
