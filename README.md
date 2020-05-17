# E4Coder GUI code generation
This is the project for the "Introduction to Embedded Systems Model 
Design" course at Scuola Superiore Sant'Anna in Pisa.

## Problem Statement
The aim of the project is to build a code generator that is able to generate 
a GUI in an embedded system (STM32F4 Discovery) starting from a XML description
made using the E4Coder GUI tool (https://e4coder.com/).

## Components
 - a simple window manager library 
 - a code generator using Acceleo
 - an LCD emulation library used for debugging purposes

## Repository structure
 - `discovery`: header files needed to compile code for the board
 - `examples`: a collection of tests and demos
 - `lcdemulation`: a small C library to emulate an LCD screen using OpenGL for
                    debugging purposes
 - `logging`: header files for the logging utility
 - `scripts`: utility scripts for converting pictures and fonts to C 
                header/implementation files for importing.
 - `widget_images`: images of the E4Coder GUI available components used to 
                    render the [widget showcase md file](widgets.md).
 - `windowmanager`: implementation of the simple window manager that backs 
                    the code generator.
