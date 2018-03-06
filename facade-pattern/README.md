## Facade Pattern

This pattern creates a simple way to use the functionality of a complex subsystem.  If you need it, you can still access that subsystem directly.

!["Sorry I can't do that, Dave".](https://user-images.githubusercontent.com/22779199/36825944-31b62974-1cd8-11e8-97b9-43e3e943a3d2.jpg)

For those who are scratching their heads, this is HAL from 2001 A Space Odyssey.  Watch it to know why I use HAL to represent the facade pattern.

This pattern lets us avoid tight coupling between clients and subsystems.

## The Principle of Least Knowledge

Classes and objects should only talk to their immediate friends. When you build in a lot of dependencies, the system becomes difficult to maintain and expand.  