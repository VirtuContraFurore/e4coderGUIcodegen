# How to use this generator

## Prerequisites
- Eclipse with modeling plugins and Acceleo

## Instructions for generation
 - Import all folders here in Eclipse
 - Go to e4codergui-model and open a new Eclipse instance with the plugin
    (under testing pane)
 - Open codegen project and convert it to an Acceleo project (under New > ...)
 - Create a new Acceleo run configuration indicating 
    `it.sssuprojects.e4codergui.codegen.main.Generate` as main class, an input
    file .xml, an output directory (e.g. generated)
 - Run it and check that the files have been created
 - Customize the callback functions in `implementation.c`

 ## Instructions for trying in the simulation
 - In the output folder, run `make` (you may need to change the `BASE_PATH` to 
    point to the root of the repository)
 - Run the new executable
 - Enjoy

## Instructions for running on the Discovery STM32 board
 - Copy the `template_discovery` folder from the `codegen` folder
 - Copy the contents of the generation output folder inside the newly copied
    folder
 - Check that the paths are correct in `Debug/makefile` (sorry, we didn't have
    time to make this step automatic)
 - Run `make` inside `Debug` folder
 - Connect the board to the PC 
 - Run `sudo st-flash write c_mX.bin 0x8000000` from within the `Debug` folder
    (in case of errors try running `sudo st-flash reset` and retry)
 - Complete the touch screen calibration
 - Enjoy