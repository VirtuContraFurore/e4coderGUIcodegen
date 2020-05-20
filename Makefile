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

windowmanager: lcdemulation				## Build widow manager static library
	$(MAKE) -C windowmanager

examples: dummy_example rectangles_example string_example button_example misc_example	## Build all examples

dummy_example: windowmanager lcdemulation		## Dummy example which uses windowmanager lib
		$(MAKE) -C examples/dummy

rectangles_example: windowmanager lcdemulation		## Rectangle example which uses windowmanager lib
		$(MAKE) -C examples/rectangles

string_example: windowmanager lcdemulation		## string example which uses windowmanager lib
		$(MAKE) -C examples/string

button_example: windowmanager lcdemulation		## button example which uses windowmanager lib
		$(MAKE) -C examples/button

misc_example: windowmanager				## misc for some example which uses windowmanager lib
	$(MAKE) -C examples/misc 

lcdemulation:  						## Build Lcd emulation static library
	$(MAKE) -C lcdemulation lib


lcdemulation_demo: 					## Build and run a demo which test the Lcd emulation lib
	$(MAKE) -C lcdemulation demo run


else ifeq ($(TARGET), discovery)

all: windowmanager examples

windowmanager:           				## Build widow manager static library
	$(MAKE) -C windowmanager

examples: wm_demo_example				## Build all examples

wm_demo_example: windowmanager				## misc for some example which uses windowmanager lib
	$(MAKE) -C examples/wm_demo/Debug TARGET=""

else

$(error "Unrecognized TARGET $(TARGET)")

endif


wm_demo_example_clean:					## clean wm_demo
		$(MAKE) -C examples/wm_demo/Debug clean

wm_demo_example_flash:					## flash wm_demo
		st-flash write examples/wm_demo/Debug/c_mX.bin 0x8000000

clean: misc_example_clean string_example_clean windowmanager_clean dummy_example_clean button_example_clean lcdemulation_clean	# clean everything

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

lcdemulation_clean:
	$(MAKE) -C lcdemulation clean

help:          						## Show this help.
	@echo "Available targets: lcdemulation, discovery"
	@echo "Available options for $(TARGET)"
	@fgrep -h "##" $(MAKEFILE_LIST) | fgrep -v fgrep | sed -e 's/\\$$//' | sed -e 's/##//'

.PHONY: all misc_example wm_demo_example dummy_example string_example_clean windowmanager examples clean windowmanager_clean dummy_example_clean button_example_clean lcdemulation lcdemulation_clean rectangles_example_clean wm_demo_example_clean wm_demo_example_flash
