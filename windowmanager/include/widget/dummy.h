#ifndef DUMMY_H
#define DUMMY_H

#include "stdbool.h"

#include "logging.h"

#include "widget/widget.h"
#include "core/touch.h"
#include "utility/blas.h"

struct dummy_WidgetData{
    void (*onTouch)(struct Widget *self, struct TouchEvent *event);
};

void dummy_draw(struct Widget *self);
bool dummy_onTouch(struct Widget *self, struct TouchEvent *event);

extern struct WidgetFunctions dummy_WidgetFunctions;

#endif