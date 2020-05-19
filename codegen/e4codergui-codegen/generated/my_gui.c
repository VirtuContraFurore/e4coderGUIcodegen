#include <stdlib.h>

#include "windowmanager/core/windowmanager.h"
#include "windowmanager/graphics/color.h"

void struct Window * createWindow_MyFrame(){
	struct Window window;
	struct Widget widgets[3];

	struct dummy_Widget rotella1;
	widgets[0].visible = true;
	widgets[0].funcs = &dummy_WidgetFunctions;
	widgets[0].data = rotella1;

	struct dummy_Widget botton2;
	widgets[1].visible = true;
	widgets[1].funcs = &dummy_WidgetFunctions;
	widgets[1].data = botton2;

	struct button_Widget bottone1;
	widgets[2].visible = true;
	widgets[2].funcs = &button_WidgetFunctions;
	widgets[2].data = bottone1;

	window.widgets = widgets;
	window.n_widgets = 3;
	window.background = WHITE;
	return &window;
}

