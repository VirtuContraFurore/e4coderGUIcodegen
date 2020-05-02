CFILES   = $(wildcard *.c)
OBJFILES = $(CFILES:.c=.o)
OUT      = dummy

$(OUT): $(OBJFILES)
	$(CC) $(LDFLAGS) -o $@ $^ $(LDLIBS)

.PHONY: clean
clean:
	rm -f $(OBJFILES) $(OUT)
