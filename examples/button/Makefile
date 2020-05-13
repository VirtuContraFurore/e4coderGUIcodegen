CFILES   = $(wildcard *.c)
OBJFILES = $(CFILES:.c=.o)
OUT      = button

$(OUT): $(OBJFILES)
	$(CC) $(LDFLAGS) -o $@ $^ $(LDLIBS)

.PHONY: clean
clean:
	rm -f $(OBJFILES) $(OUT)
