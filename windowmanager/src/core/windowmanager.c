#include <stddef.h>

#include "logging.h"

#include "windowmanager/core/windowmanager.h"

struct WindowManager WINDOW_MANAGER;

#define CURRENT_WINDOW &(WINDOW_MANAGER.windows[WINDOW_MANAGER.curr_window])

void WM_init(struct Window *windows, unsigned int n_windows, unsigned int width, unsigned int height){
    WINDOW_MANAGER.windows = windows;
    WINDOW_MANAGER.n_windows = n_windows;
    WINDOW_MANAGER.redraw = false;
    WINDOW_MANAGER.force_redraw = true;
    WINDOW_MANAGER.width = width;
    WINDOW_MANAGER.height = height;
}

void WM_handleEvents(){
    struct TouchEvent *event;

    event = WM_getTouchEvent();
    if (event != NULL){
        struct Window *window = CURRENT_WINDOW;
        for (int i = window->n_widgets - 1; i >= 0; i--){
            struct Widget *widget = &(window->widgets[i]);
            if (widget->funcs->onTouch(widget, event)){
                break;
            }
        }
    }
}

void WM_update(){
    struct Window *window = CURRENT_WINDOW;

    if (WINDOW_MANAGER.redraw || WINDOW_MANAGER.force_redraw){
        if (WINDOW_MANAGER.force_redraw){
            WM_SCRIF_clearColor(window->background);
        }
        
        for (int i = 0; i < window->n_widgets; i++){
            struct Widget *widget = &(window->widgets[i]);

            if (WINDOW_MANAGER.force_redraw || widget->redraw){
                widget->funcs->draw(widget);
                widget->redraw = false;
            }
        }

        WM_SCRIF_flush(); //finalize drawing
        WINDOW_MANAGER.redraw = false;
        WINDOW_MANAGER.force_redraw = false;
    }

}

void WM_scheduleRedraw(){
    WINDOW_MANAGER.redraw = true;
}

void WM_scheduleForcedRedraw(){
    WINDOW_MANAGER.force_redraw = true;
}

void WM_setCurrentWindow(unsigned int window_idx){
    WINDOW_MANAGER.force_redraw = true;

    if (window_idx < WINDOW_MANAGER.n_windows){
        WINDOW_MANAGER.curr_window = window_idx;
    } else {
        LOG_ERROR("Window index out of range", window_idx);
    }
}

struct Window* WM_getWindow(unsigned int window_idx){
    if (window_idx < WINDOW_MANAGER.n_windows){
        return &(WINDOW_MANAGER.windows[window_idx]);
    } else {
        LOG_ERROR("Window index out of range", window_idx);
        return NULL;
    }
}
struct Window* WM_getCurrentWindow(){
    return WM_getWindow(WINDOW_MANAGER.curr_window);
}

struct Widget* WM_getWidget(unsigned int window_idx, unsigned int widget_idx){
    if (window_idx < WINDOW_MANAGER.n_windows){
        struct Window *window = &(WINDOW_MANAGER.windows[window_idx]);
        if (widget_idx < window->n_widgets){
            return &(window->widgets[widget_idx]);
        } else {
            LOG_ERROR("Widget index out of range", widget_idx);
            return NULL;
        }
    } else {
        LOG_ERROR("Window index out of range", window_idx);
        return NULL;
    }
}

