CFILES   = $(wildcard *.c)
OBJFILES = $(CFILES:.c=.o)
OUT      = rectangles

WM_LIB = $(WM_LIBDIR)/lib${WM_LIBNAME}.a
LEMU_LIB = $(LEMU_LIBDIR)/lib${LEMU_LIBNAME}.a

override CFLAGS += -I $(WM_INCLUDE) -I $(LOG_INCLUDE) -I $(LEMU_INCLUDE)
override LDFLAGS += -L $(WM_LIBDIR) -L $(LEMU_LIBDIR)
override LDLIBS += -l$(WM_LIBNAME) -l$(LEMU_LIBNAME) -lGL -lglut -lGLEW

$(OUT): $(OBJFILES) $(WM_LIB) $(LEMU_LIB)
	$(CC) $(LDFLAGS) -o $@ $^ $(LDLIBS)
	chmod +x $(OUT)
	
.PHONY: clean
clean:
	rm -f $(OBJFILES) $(OUT)
