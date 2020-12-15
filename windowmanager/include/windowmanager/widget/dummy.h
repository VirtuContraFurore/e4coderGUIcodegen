#ifndef DUMMY_H
#define DUMMY_H

#include "stdbool.h"

#include "logging.h"

#include "windowmanager/widget/widget.h"
#include "windowmanager/core/touch.h"
#include "windowmanager/utility/geometry.h"

extern struct WidgetFunctions dummy_WidgetFunctions;

struct dummy_WidgetData{
    void (*onTouch)(struct Widget *self, struct TouchEvent *event);
};

void dummy_draw(struct Widget *self);
bool dummy_onTouch(struct Widget *self, struct TouchEvent *event);

#endif