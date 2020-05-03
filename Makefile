LOG_INCLUDE = $(abspath logging/include)
WM_INCLUDE = $(abspath windowmanager/include)
WM_LIBDIR = $(abspath windowmanager/build/lib)
WM_LIBNAME = windowmanager
LEMU_INCLUDE = $(abspath lcdemulation/include)
LEMU_LIBDIR = $(abspath lcdemulation/build/lib)
LEMU_LIBNAME = lcdemulation


all: lcdemulation windowmanager examples

$(WM_LIBDIR)/libwindowmanager.a: windowmanager

windowmanager: ## Build widow manager static library
	$(MAKE) -C windowmanager

examples: dummy_example lcdemulation_demo

dummy_example: windowmanager/build/lib/libwindowmanager.a ## Dummy example which uses windowmanager lib
	$(MAKE) -C examples/dummy CC="$(CC)" CFLAGS="$(CFLAGS) -I $(WM_INCLUDE) -I $(LOG_INCLUDE)" LDFLAGS="$(LDFLAGS) -L  $(WM_LIBDIR)" LDLIBS="$(LDLIBS) -l$(WM_LIBNAME)"

clean: windowmanager_clean dummy_example_clean lcdemulation_clean

windowmanager_clean:
	$(MAKE) -C windowmanager clean

dummy_example_clean:
	$(MAKE) -C examples/dummy clean
	
lcdemulation:  ## Build Lcd emulation static library
	$(MAKE) -C lcdemulation lib
	
lcdemulation_clean:
	$(MAKE) -C lcdemulation clean

lcdemulation_demo: ## Build and run a demo which test the Lcd emulation lib
	$(MAKE) -C lcdemulation demo run
	
help:           ## Show this help.
	@fgrep -h "##" $(MAKEFILE_LIST) | fgrep -v fgrep | sed -e 's/\\$$//' | sed -e 's/##//'

.PHONY: all dummy_example windowmanager examples clean windowmanager_clean dummy_example_clean lcdemulation lcdemulation_clean 
