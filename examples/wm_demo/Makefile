# This just bruteforcefully lanches the original makefile, ignores the 
# linker error and continues compilation

# set your own path for these variables
CC = /usr/bin/arm-none-eabi-gcc
ERIKA_FILES = /home/up/uni/dinatale/eclipse/plugins/com.eu.evidence.ee_2.8.0.20171025_0922/ee_files

CFLAGS += -I $(WM_INCLUDE)
CFLAGS += -L $(WM_LIBDIR)
CFLAGS += -l $(WM_LIB)

export CFLAGS
export ERIKA_FILES

# conflicts with Erika makefiles
unexport TARGET
unexport MAKEFLAGS

build:
	@echo "Compiling (expected errors!)"
	-$(MAKE) -C Debug
	@echo "Linking (fix previous error)"
	$(CC) -static -mcpu=cortex-m4 -mthumb -mthumb-interwork -ggdb -L/usr/arm-none-eabi/lib/thumb -L/usr/arm-none-eabi/lib/thumb -L.  -Wl,-e,EE_cortex_mx_default_reset_ISR -o Debug/c_mX.elf Debug/obj/LCD_Touch_Calibration.o Debug/obj/STMPE811QTR.o Debug/obj/code.o Debug/obj/widget_config.o Debug/obj/eecfg.o Debug/obj/pkg/mcu/st_stm32_stm32f4xx/src/startup_stm32f4xx_gnu.o Debug/obj/pkg/mcu/st_stm32_stm32f4xx/src/system_stm32f4xx.o Debug/obj/stm32f4_discovery_lcd.o Debug/libee.a Debug/libstm32f4discovery.a Debug/libstm32f4xxspd.a $(WM_LIBDIR)/lib$(WM_LIBNAME).a -Wl,-T$(ERIKA_FILES)/pkg/mcu/st_stm32_stm32f4xx/src/stm32f40x_gnu.ld  -Wl,-Map,Debug/c_mX.map
	@echo "Finishing compilation"
	$(MAKE) -C Debug

clean:
	$(MAKE) -C Debug clean

flash:
	st-flash write Debug/c_mX.bin 0x8000000

.PHONY: build clean
