# List of E4CoderGUi widgets

## Button
![](widget_images/button.png)

### Behaviour
Maybe darken background while being pressed.

### Properties
    - name
    - position
    - size
    - outputPort
    - text

## Button Image
![](widget_images/button_image.png)

### Behaviour
When not pressed draw `releasedImage`, instead, while it is being pressed,
draws `pressedImage`.

### Properties
    - name
    - position
    - size
    - outputPort
    - pressedImagePath
    - releasedImagePath
    
## Button Knob
![](widget_images/button_knob.png)

### Behaviour
Like button image but it can also be rotated.

### Properties
    - name
    - position
    - size
    - outputPort
    - rotationOutputPort
    - pressedImagePath
    - releasedImagePath

## Button LED
![](widget_images/button_led.png)

### Behaviour
Like button image but it also has a binary state that can be set by the running
application.

### Properties
    - name
    - position
    - size
    - inputPort
    - outputPort
    - initialState
    - inactivePressedImagePath
    - inactiveReleasedImagePath
    - activePressedImagePath
    - activeReleasedImagePath

## Buzzer (?)
![](widget_images/buzzer.png)

### Behaviour
An image that shows when a sound is being played.

### Properties
    - name
    - position
    - size
    - inputFrequencyPort
    - playingImagePath
    - mutedImagePath

## Color Bar
![](widget_images/color_bar.png)

### Behaviour
A bar that shows the progress / capacity / dunno.

### Properties
    - name
    - position
    - size
    - inputPort
    - minimum
    - maximum
    - value
    - orientation (one of BottomToTop, TopToBottom, LeftToRight, RightToLeft)
    - fillColor
    - backgroundColor
    - textOption (one of Percentage, Absolute, NoText)
    - textFont
    - textColor

## Image
![](widget_images/image.png)

### Behaviour
An image that has two states.

### Properties
    - name
    - position
    - size
    - inputPort
    - activeImagePath
    - inactiveImagePath
    - initialState

## Link (?)
![](widget_images/link.png)

### Behaviour
A text with an url associated...

### Properties
    - name
    - position
    - size
    - text
    - url
    
## Needle
![](widget_images/needle.png)

### Behaviour
A rotating needle.

### Properties
    - name
    - position
    - size
    - inputPort
    - needleImagePath
    - elementPivotPoint
    - initialValue
    
## Plot
![](widget_images/plot.png)

### Behaviour
A plot that shows the change in time of a variable.

### Properties
    - name
    - position
    - size
    - inputPort
    - lineColor
    - scrollWindow
    - yScaleType (one of Manual and Auto)
    - yMinimum
    - yMaximum

## Plotter 2D
![](widget_images/plotter_2d.png)

### Behaviour
A canvas where something can be drawn. A marker shows the current head position.

### Properties
    - name
    - position
    - size
    - xInputPort
    - yInputPort
    - initialX
    - initialY
    - markerImagePath
    - backgroundColor
    
## Rectangle
![](widget_images/rectangle.png)

### Behaviour
Just a rectangle but it has two states.

### Properties
    - name
    - position
    - size
    - inputPort
    - activeColor
    - inactiveColor
    - initialState
    
## Roller
![](widget_images/roller.png)

### Behaviour
A rotating disc where the rotation axis is parallel to the screen.

### Properties
    - name
    - position
    - size
    - outputPort
    - vertical (true/false)
    - minimum
    - maximum
    - value

## Slider
![](widget_images/slider.png)

### Behaviour
It can be moved horizontally or vertically.

### Properties
    - name
    - position
    - size
    - outputPort
    - vertical (true/false)
    - minimum
    - maximum
    - value

## SpinBox
![](widget_images/spinbox.png)

### Behaviour
A text widget with two small buttons that shows a number that can be increased 
or decreased using the buttons.

### Properties
    - name
    - position
    - size
    - outputPort
    - vertical (true/false)
    - minimum
    - maximum
    - value
    - font
    - textColor
    - backgroundColor

## Switch
![](widget_images/switch.png)

### Behaviour
Like a button image but the drawn image is changed on every touch not just while
being pressed. We could also make it change state when dragged instead of just 
touched.

### Properties
    - name
    - position
    - size
    - outputPort
    - onImagePath
    - offImagePath

## Text Label
![](widget_images/text_label.png)

### Behaviour
A text.

### Properties
    - name
    - position
    - size
    - inputPort
    - font
    - textColor
    - backgroundColor
    - initialText
    - horizontalAlignment (one of Left, Right, HCenter, Justify)
    - vertical Alignment (one of Top, Bottom, VCenter)

## Tracker 2D
![](widget_images/tracker_2d.png)

### Behaviour
Like the plotter but shows the user input.

### Properties
    - name
    - position
    - size
    - xOutputPort
    - yOutputPort
    - initialX
    - initialY
    - markerImagePath
    - backgroundColor
    