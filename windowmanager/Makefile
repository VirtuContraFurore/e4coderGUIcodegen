TARGET := lcdemulation

SRCS := $(shell find . -name "*.c")
OBJDIR := build/$(TARGET)
OUTDIR := $(OBJDIR)/lib

FOLDERS := $(strip $(shell find . -type d -not -path "*build*" -not -path "*include*" -printf '%P\n'))
OBJFOLDERS := $(FOLDERS:%=$(OBJDIR)/%)

OBJS := $(SRCS:%.c=$(OBJDIR)/%.o)
OUT := $(OUTDIR)/libwindowmanager.a

DEPDIR := $(OBJDIR)/.deps
DEPFLAGS = -MT $@ -MMD -MP -MF $(DEPDIR)/$*.d
DEPFOLDERS := $(FOLDERS:%=$(DEPDIR)/%)

ifeq ($(TARGET), lcdemulation)
	CC = gcc
	AR = ar
	override CFLAGS += -I $(LEMU_INCLUDE)
	override CFLAGS += -fPIC 
	override CFLAGS += -DTARGET=TARGET_LCDEMULATOR
else ifeq ($(TARGET), discovery)
	CC = arm-none-eabi-gcc 
	AR = arm-none-eabi-ar
	override CFLAGS += -mcpu=cortex-m4 -mthumb -mthumb-interwork -ggdb -O0 -Wno-attributes
	override CFLAGS += -I $(STM32F4xx_INCLUDE) 
	override CFLAGS += -I $(STM32F4Discovery_INCLUDE) 
	override CFLAGS += -I $(CMSIS_INCLUDE) 
	override CFLAGS += -I $(STM32F4xx_SPD_INCLUDE)
	override CFLAGS += -I $(DISCOVERY_INCLUDE)
	override CFLAGS += -D__USE_STM32F4XX_SPD__ -D__USE_STM32F4XX_SPD_DMA__ -D__USE_STM32F4XX_SPD_I2C__ -D__USE_STM32F4_DISCOVERY__ -D__USE_STM32F4_DISCOVERY_LEDS__ -D__USE_STM32F4XX_SPD_GPIO__ -D__USE_STM32F4XX_SPD_RCC__ -D__USE_STM32F4_DISCOVERY_LCD__ -D__USE_STM32F4XX_SPD_GPIO__ -D__USE_STM32F4XX_SPD_RCC__ -D__USE_STM32F4XX_SPD_FSMC__ -D__USE_STM32F4XX_SPD__ -DDEBUG -D__ADD_LIBS__ -D__USE_SYSTICK__ -D__RTD_LINUX__ -D__STM32__ -D__STM32F4xx__ -D__CORTEX_MX__ -D__CORTEX_M4__ -D__GNU__ -D__FP__ -D__MONO__ -D__ALARMS__ -D__FP_NO_RESOURCE__ -D__DISABLE_EEOPT_DEFINES__ -D__ERIKA__ -DSTM32F4XX -D__USE_STM32F4XX_SPD_RCC__ -D__USE_STM32F4XX_SPD_GPIO__ -D__USE_STM32F4XX_SPD_FSMC__ -DUSE_STDPERIPH_DRIVER
	override CFLAGS += -DTARGET=TARGET_DISCOVERY
endif

override CFLAGS += -I include/ -I ../logging/include/

COMPILE.c = $(CC) $(DEPFLAGS) $(CFLAGS) $(TARGET_ARCH) -c

$(OUT): $(OBJS) | $(OUTDIR)
	$(AR) r $@ $^

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
