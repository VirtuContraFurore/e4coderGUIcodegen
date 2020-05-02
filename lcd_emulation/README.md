# Quick start guide:


## Dependecies

Libs used: 

- OpenGL
- freeglut
- glew

How to install:

```
sudo apt-get install libgl1-mesa-glx freeglut3 libglew_dev
```

Then you should be able to type:

```
glxinfo | grep version
```

## Build & run

To build the library liblcdemulation:

```
make lib
```

To ran the test demo:

```
make demo run
```

## Using liblcdemulation

```
gcc ... -Lbuild/lib -llcdemulation

```