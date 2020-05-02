#simple make file

IDIR =./include
CC=gcc
CFLAGS=-I$(IDIR)

LIBS=-lGL -lglut -lGLEW -lm

OBJ = lcd_demo.o lcd_emulation.o

%.o: %.c $(DEPS)
	$(CC) -c -o $@ $< $(CFLAGS)

lcd_demo: $(OBJ)
	$(CC) -o $@ $^ $(CFLAGS) $(LIBS)

.PHONY: all clean run

clean:
	rm -f *.o
	
run:
	./lcd_demo
	
all: lcd_demo

