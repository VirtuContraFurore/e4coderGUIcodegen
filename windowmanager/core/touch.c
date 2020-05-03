#include "stdlib.h"
#include "windowmanager/core/touch.h"

struct TouchEvent getTouchEvent(struct Point *newp, struct Point *oldp){
    struct TouchEvent event;

    if (newp == NULL && oldp == NULL){
        event.type = NO_TOUCH;
        event.event_data = NULL;
    } else if (newp == NULL && oldp != NULL){
        event.type = SINGLE_TOUCH;
        struct SingleTouchData *data = (struct SingleTouchData*) malloc(sizeof(struct SingleTouchData));
        data->type = TOUCH_UP;
        data->x = oldp->x;
        data->y = oldp->y;
        event.event_data = data;
    } else if (newp != NULL && oldp == NULL){
        event.type = SINGLE_TOUCH;
        struct SingleTouchData *data = (struct SingleTouchData*) malloc(sizeof(struct SingleTouchData));
        data->type = TOUCH_DOWN;
        data->x = newp->x;
        data->y = newp->y;
        event.event_data = data;
    } else if (newp != NULL && oldp != NULL){
        event.type = DRAG_TOUCH;
        struct DragTouchData *data = (struct DragTouchData*) malloc(sizeof(struct DragTouchData));
        data->start_x = oldp->x;
        data->start_y = oldp->y;
        data->end_x = newp->x;
        data->end_y = newp->y;
        event.event_data = data;
    }

    return event;
}