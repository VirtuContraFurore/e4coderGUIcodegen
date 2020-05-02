LOG_INCLUDE = $(abspath logging/include)
WM_INCLUDE = $(abspath windowmanager/include)
WM_LIBDIR = $(abspath windowmanager/build/lib)
WM_LIBNAME = windowmanager

all: windowmanager examples

windowmanager: 
	$(MAKE) -C windowmanager

examples: dummy_example

dummy_example: windowmanager
	$(MAKE) -C examples/dummy CC="$(CC)" CFLAGS="$(CFLAGS) -I $(WM_INCLUDE) -I $(LOG_INCLUDE)" LDFLAGS="$(LDFLAGS) -L  $(WM_LIBDIR)" LDLIBS="$(LDLIBS) -l$(WM_LIBNAME)"

clean: windowmanager_clean dummy_example_clean

windowmanager_clean:
	$(MAKE) -C windowmanager clean

dummy_example_clean:
	$(MAKE) -C examples/dummy clean

.PHONY: all dummy_example windowmanager examples clean windowmanager_clean dummy_example_clean