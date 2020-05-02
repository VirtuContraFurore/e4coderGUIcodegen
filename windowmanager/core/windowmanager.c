#include "logging.h"

#include "core/windowmanager.h"

struct WindowManager WINDOW_MANAGER;

#define CURRENT_WINDOW &(WINDOW_MANAGER.windows[WINDOW_MANAGER.curr_window])

void WM_init(struct Window *windows, unsigned int n_windows, 
             struct ScreenInterface *screen_interface){
    WINDOW_MANAGER.screen_interface = screen_interface;
    WINDOW_MANAGER.windows = windows;
    WINDOW_MANAGER.n_windows = n_windows;
    WINDOW_MANAGER.redraw = true;
    WINDOW_MANAGER.force_redraw = false;
}

void WM_handleEvents(){
    int ret;
    struct TouchEvent event;

    ret = WINDOW_MANAGER.screen_interface->getTouchEvent(&event);
    if (ret > 0){
        struct Window *window = CURRENT_WINDOW;
        for (int i = window->n_widgets - 1; i >= 0; i--){
            struct Widget *widget = &(window->widgets[i]);
            if (widget->funcs->onTouch(widget, &event)){
                break;
            }
        }
    } else if (ret < 0){
        LOG_ERROR("getTouchEvent returned %d", ret);
    }
}

void WM_update(){
    struct Window *window = CURRENT_WINDOW;

    if (WINDOW_MANAGER.redraw || WINDOW_MANAGER.force_redraw){
        bool domino_redraw = WINDOW_MANAGER.force_redraw;

        for (int i = 0; i < window->n_widgets; i++){
            struct Widget *widget = &(window->widgets[i]);

            if (domino_redraw || widget->redraw){
                widget->funcs->draw(widget);
                domino_redraw = true;
            }
        }
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

inline int WM_SI_getTouchEvent(struct TouchEvent* event){
    return WINDOW_MANAGER.screen_interface->getTouchEvent(event);
}

inline void WM_SI_drawPixel(struct Point p, struct Color c){
    return WINDOW_MANAGER.screen_interface->drawPixel(p, c);
}