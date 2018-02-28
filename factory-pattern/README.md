## Factory Pattern

The factory pattern encapsulates object creation.  An abstract creator class (the parent class) defines abstract factory methods that the subclasses use to create their own custom implementations of objects. 

The Factory Method Pattern defines an interface (not a literal interface) for creating an object but lets the subclasses decide which class to instantiate.  By "decide", I mean that the parent class is written w/out knowledge of the specific objects that will be created with them.  Those objects are created via the selection of the specific subclasses.

![Pizza!](https://user-images.githubusercontent.com/22779199/36814491-af9ac54e-1ca5-11e8-9798-3f90f1236736.jpg)

A real life example would be the franchising of a pizza shop.  All of the pizza shops would have the generic (abstract) procedures to make a pizza (bake, add toppings, box, slice, etc).  They inherit those from original pizza shop (the abstract pizza shop AKA the parent class)  The individual shops could use those handed down procedures and customize them.  One shop has a clientele that likes banana peppers on their pizza so they change the process in their shop to add banana peppers.  Another franchisee has customers that like anchovies (yum!) so that shop adds anchovies to their offerings.  Etc, etc.  If you want a pizza with banana peppers, you call the pizza shop that offers them.  You choose the banana pepper shop, order a banana pepper pizza, and thus you can get a banana pepper pizza.

![Factory UML](https://user-images.githubusercontent.com/22779199/35464505-3200ed70-02c4-11e8-8b4c-fd18e7e54f97.png)

All of the pizza shops (the parent class and child classes) are the Creator classes.
All of the pizzas (the abstract pizza and the child concrete pizzas) are the Product classes.

The concrete product classes are the only classes that have the knowledge to create concrete products (objects).

## Tips

No variable should hold a reference to a concrete class (ie. you can't use "new", use a factory instead).

No class should derive from a concrete class.  Derive from an abstract class instead.  

No @Overrides allowed in the child classes.  Using one means that your abstract method wasn't abstract enough.
