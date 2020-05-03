#ifndef GEOMETRY_H
#define GEOMETRY_H

#include "stdbool.h"

struct Point{
  int x;
  int y;
};

struct Rect{
  struct Point pos;
  unsigned int w;
  unsigned int h;
};

struct RectAbs{
  struct Point top_left;
  struct Point bottom_right;
};

enum Direction {UP, DOWN, LEFT, RIGHT};

bool pointInRect(struct Point p, struct Rect r);
struct Rect rectAbs2rect(struct RectAbs ra);
struct RectAbs rect2rectAbs(struct Rect r);

#endif