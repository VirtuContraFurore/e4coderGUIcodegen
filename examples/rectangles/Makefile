CFILES   = $(wildcard *.c)
OBJFILES = $(CFILES:.c=.o)
OUT      = rectangles

$(OUT): $(OBJFILES)
	$(CC) $(LDFLAGS) -o $@ $^ $(LDLIBS)

.PHONY: clean
clean:
	rm -f $(OBJFILES) $(OUT)
