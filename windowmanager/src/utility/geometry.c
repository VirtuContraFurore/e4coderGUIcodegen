#include "windowmanager/utility/geometry.h"

bool pointInRect(struct Point p, struct Rect r){
    if (p.x < r.pos.x)
        return false;
    if (p.x > r.pos.x + r.w)
        return false;
    if (p.y < r.pos.y)
        return false;
    if (p.y > r.pos.y + r.h)
        return false;
    return true;
}

struct Rect rectAbs2rect(struct RectAbs ra){
    return (struct Rect){
        .pos = (struct Point){
            .x = ra.top_left.x,
            .y = ra.top_left.y
        },
        .w = ra.bottom_right.x - ra.top_left.x,
        .h = ra.bottom_right.y - ra.top_left.y
    };
}

struct RectAbs rect2rectAbs(struct Rect r){
    return (struct RectAbs){
        .top_left = (struct Point){
            .x = r.pos.x,
            .y = r.pos.y
        },
        .bottom_right = (struct Point){
            .x = r.pos.x + r.w,
            .y = r.pos.y + r.h
        },
    };
}