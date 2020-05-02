# Quick start guide:


## Dependecies

Libs used: 

- OpenGL
- mesa utils
- freeglut
- glew

How to install:

```
sudo apt-get install libgl1-mesa-glx mesa-utils freeglut3-dev libglew-dev
```

Then you should be able to type:

```
glxinfo | grep version
```

## Build & run

To build the library **liblcdemulation**:

```
make lib
```

To run the test demo:

```
make demo run
```

## Using liblcdemulation

```
gcc ... -Lbuild/lib -llcdemulation

```