TARGET := lcdemulation

LOG_INCLUDE = $(abspath logging/include)

WM_INCLUDE = $(abspath windowmanager/include)
WM_LIBDIR = $(abspath windowmanager/build/$(TARGET)/lib)
WM_LIBNAME = windowmanager

LEMU_INCLUDE = $(abspath lcdemulation/include)
LEMU_LIBDIR = $(abspath lcdemulation/build/lib)
LEMU_LIBNAME = lcdemulation

STM32F4xx_INCLUDE = $(abspath discovery/STM32F4xx/Include)
STM32F4xx_SPD_INCLUDE = $(abspath discovery/STM32F4xx_StdPeriph_Driver/inc)
STM32F4Discovery_INCLUDE = $(abspath discovery/STM32F4-Discovery/inc)
CMSIS_INCLUDE = $(abspath discovery/CMSIS/Include)
DISCOVERY_INCLUDE = $(abspath discovery/include)

export

ifeq ($(TARGET), lcdemulation)
all: lcdemulation windowmanager examples

windowmanager: lcdemulation			## Build widow manager static library
	$(MAKE) -C windowmanager
else
all: windowmanager

windowmanager:           			## Build widow manager static library
	$(MAKE) -C windowmanager
endif

examples: dummy_example rectangles_example string_example button_example misc_example

dummy_example: windowmanager lcdemulation		## Dummy example which uses windowmanager lib
		$(MAKE) -C examples/dummy

rectangles_example: windowmanager lcdemulation		## Rectangle example which uses windowmanager lib
		$(MAKE) -C examples/rectangles

string_example: windowmanager lcdemulation		## string example which uses windowmanager lib
		$(MAKE) -C examples/string

button_example: windowmanager lcdemulation		## button example which uses windowmanager lib
		$(MAKE) -C examples/button

misc_example: windowmanager		## misc for some example which uses windowmanager lib
	$(MAKE) -C examples/misc 

clean: misc_example_clean string_example_clean windowmanager_clean dummy_example_clean button_example_clean lcdemulation_clean

windowmanager_clean:
	$(MAKE) -C windowmanager clean

dummy_example_clean:
	$(MAKE) -C examples/dummy clean

button_example_clean:
		$(MAKE) -C examples/button clean

rectangles_example_clean:
	$(MAKE) -C examples/dummy clean

string_example_clean:
	$(MAKE) -C examples/string clean

misc_example_clean:
		$(MAKE) -C examples/misc clean

lcdemulation:  						## Build Lcd emulation static library
	$(MAKE) -C lcdemulation lib

lcdemulation_clean:
	$(MAKE) -C lcdemulation clean

lcdemulation_demo: 					## Build and run a demo which test the Lcd emulation lib
	$(MAKE) -C lcdemulation demo run

help:          						## Show this help.
	@fgrep -h "##" $(MAKEFILE_LIST) | fgrep -v fgrep | sed -e 's/\\$$//' | sed -e 's/##//'

.PHONY: all misc_example dummy_example string_example_clean windowmanager examples clean windowmanager_clean dummy_example_clean button_example_clean lcdemulation lcdemulation_clean rectangles_example_clean
