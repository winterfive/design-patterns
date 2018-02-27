## Decorator Pattern  

The decorator pattern can add more responsibilities to an object dynamically (during runtime) using
a form of object composition.  This allows for expansion of code without subclassing.

![Latte with planet and galaxy design](https://user-images.githubusercontent.com/22779199/36761920-2ce063a4-1bef-11e8-927a-48c5acaa97ae.jpg)
Beverage -> Coffee -> Latte -> Decorators(Foam, Galxy desing, extra milk)

![UML for Decorator Pattern](https://user-images.githubusercontent.com/22779199/35353631-be5e935e-0115-11e8-825f-354feece7f44.png)

In RL, the decorator can be used to wrap a simple file input stream with various decorators from the Java I/O library.

## Classes should be open for extension but closed for modification.  

## Tips  

Decorators are the same type of the components they decorate.  

You can wrap a concrete component with many decorators. 

The decorator pattern may result in a lot of small classes in your design.


