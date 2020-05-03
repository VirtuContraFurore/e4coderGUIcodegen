#simple make file

IDIR =./include
CC=gcc
CFLAGS=-I$(IDIR) -fPIC

LIBS=-lGL -lglut -lGLEW -lm

LIBNAME=lcdemulation
OBJDIR := build
OUTDIR := $(OBJDIR)/lib
OUT := $(OUTDIR)/lib$(LIBNAME).a

$(OBJDIR): ; @mkdir -p $@
$(OUTDIR): $(OBJDIR) ; @mkdir -p $@

$(OBJDIR)/%.o: %.c $(OBJDIR)
	$(CC) -c -o $@ $< $(CFLAGS) $(LIBS)

$(OUT): $(OBJDIR)/lcd_emulation.o $(OUTDIR)
	ar r $@ $<

demo: $(OBJDIR)/lcd_demo.o $(OUT)
	$(CC) -o lcd_demo $^ $(CFLAGS) $(LIBS) -L$(OUTDIR) -l$(LIBNAME)

.PHONY: clean

clean:
	rm -f $(OBJDIR)/*.o
	
run:
	./lcd_demo
	
lib: $(OUT)
	
all: lib demo run
	

