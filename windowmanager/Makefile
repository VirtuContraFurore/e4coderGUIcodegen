SRCS := $(shell find . -name "*.c")
OBJDIR := build
OUTDIR := $(OBJDIR)/lib

FOLDERS := $(strip $(shell find . -type d -not -path "*build*" -not -path "*include*" -printf '%P\n'))
OBJFOLDERS := $(FOLDERS:%=$(OBJDIR)/%)

OBJS := $(SRCS:%.c=$(OBJDIR)/%.o)
OUT := $(OUTDIR)/libwindowmanager.a

DEPDIR := $(OBJDIR)/.deps
DEPFLAGS = -MT $@ -MMD -MP -MF $(DEPDIR)/$*.d
DEPFOLDERS := $(FOLDERS:%=$(DEPDIR)/%)

CFLAGS = -I include/ -I ../logging/include/

COMPILE.c = $(CC) $(DEPFLAGS) $(CFLAGS) $(TARGET_ARCH) -c

$(OUT): $(OBJS) | $(OUTDIR)
	ar rcs $@ $^

%.o : %.c
$(OBJDIR)/%.o : %.c $(DEPDIR)/%.d | $(DEPDIR) $(OBJFOLDERS) $(DEPFOLDERS)
	$(COMPILE.c) $(OUTPUT_OPTION) $<

$(OBJDIR): ; @mkdir -p $@
$(DEPDIR): $(OBJDIR) ; @mkdir -p $@
$(OUTDIR): $(OBJDIR) ; @mkdir -p $@

DEPFILES := $(SRCS:%.c=$(DEPDIR)/%.d)
$(DEPFILES):
include $(wildcard $(DEPFILES))

$(OBJFOLDERS) : $(OBJDIR)/% :  $(OBJDIR) ; @mkdir -p $@
$(DEPFOLDERS) : $(DEPDIR)/% :  $(DEPDIR) ; @mkdir -p $@

.PHONY: clean

clean:
	rm -rf build/
