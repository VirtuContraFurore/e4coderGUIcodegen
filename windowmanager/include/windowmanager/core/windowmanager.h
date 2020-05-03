
#ifndef WINDOW_MANAGER_H
#define WINDOW_MANAGER_H

#include "windowmanager/widget/widget.h"
#include "windowmanager/graphics/color.h"
#include "windowmanager/graphics/bitmap.h"
#include "windowmanager/graphics/font.h"
#include "windowmanager/utility/geometry.h"

#include "windowmanager/core/touch.h"

struct ScreenInterface{
  int (*getTouchEvent)(struct TouchEvent* event);

  void (*clear)();
  void (*clearColor)(struct Color c);
  void (*putPixel)(struct Point p, struct Color c);
  void (*drawLine)(struct Point from, int length, enum Direction direction, struct Color c);
  void (*drawUniLine)(struct Point from, struct Point to, struct Color c);
  void (*drawUniLineRelative)(struct Point from, struct Point dist, struct Color c);
  void (*drawRect)(struct Point pos, int w, int h, struct Color c);
  void (*fillRect)(struct Point pos, int w, int h, struct Color c);
  void (*drawBitmap)(struct Point pos, struct Bitmap* bitmap);
  void (*drawString)(struct Point pos, char* string, struct Font* font, struct Color c);
  // TODO add what is needed
};

struct Window{
  struct Widget *widgets;
  unsigned int n_widgets;
};

struct WindowManager{
  bool redraw;
  bool force_redraw;
  struct Window *windows;
  struct ScreenInterface *screen_interface;
  unsigned int curr_window;
  unsigned int n_windows;
};

void WM_init(struct Window *windows, unsigned int n_windows, 
             struct ScreenInterface *screen_interface);
void WM_handleEvents();
void WM_update();
void WM_scheduleRedraw();
void WM_scheduleForcedRedraw();
void WM_setCurrentWindow(unsigned int window_idx);
struct Window* WM_getWindow(unsigned int window_idx);
struct Widget* WM_getWidget(unsigned int window_idx, unsigned int widget_idx);

struct ScreenInterface* WM_getScreenInterface();

#endif