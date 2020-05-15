/*
 * widget_config.c
 *
 *  Created on: May 15, 2020
 *      Author: up
 */

#include "widget_config.h"
#include <stdbool.h>
#include "arial48.h"
#include "button_image.h"
#include <stdio.h>

struct Color colors[] = {RED, GREEN, BLUE, WHITE, BLACK};
char txt[50] = "Toccami :D";

struct Rect ret = {
    .pos = {
        .x=50,
        .y=50
    },
    .w = 100,
    .h = 100
};


struct text_Widget testo;

struct button_Widget bottone;

struct Widget widgets[2];

struct Window window;

int count = 0;
bool m_onTouch(struct Widget *self, struct TouchEvent *event){
    sprintf(testo.initialText, "%d\0", ++count);
    WM_getCurrentWindow()->background = colors[count%5];
    WM_Widget_redrawAll(self);
    return true;
}

void initWidgets(){
    bottone.dim = ret;
    bottone.Image = bitmap_button;
    bottone.onTouch = m_onTouch;

    testo.backgroundColor = TRANSPARENT;
    testo.textColor = RED;
    testo.dim = (struct Rect){
        .pos = {
            .x=50,
            .y=150
        },
        .w = 100,
        .h = 50
    };
    testo.font = &font_arial48px;
    testo.initialText = txt;

    widgets[0].visible = true;
    widgets[0].funcs = &button_WidgetFunctions;
    widgets[0].data = (void*) &bottone;

    widgets[1].visible = true;
    widgets[1].funcs = &text_WidgetFunctions;
    widgets[1].data = (void*) &testo;

    window.widgets = widgets;
    window.n_widgets = 2;
    window.background = BLACK;

    WM_init(&window, 1, 320, 240);
    WM_update();
}

