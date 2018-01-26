## Factory Pattern

The factory pattern encapsulates object creation.  An abstract creator class (the parent class) defines abstract factory methods that the subclasses use to create their own custom implementations of objects. 

The Factory Method Pattern defines an interface (not a literal interface) for creating an object but let's the subclasses decide which class to instantiate.  By "decide", we mean that the parent class is written w/out knowledge of the specific objects that will be created with them.  Those objects are created via the selection of the specific subclasses.

A real life example would be the franchising of a pizza shop.  All of the pizza shops would have the generic (abstract) procedures to make a pizza (bake, add toppings, put it in a box, slicing, etc).  They inherit those from original pizza shop (the abstract pizza shop AKA the parent class)  The individual shops could use those handed down procedures and customize them.  One shop has a clientele that likes banana peppers on their pizza so they change the process in their shop to add banana peppers.  Another franchisee has customers that like anchovies (yum!) so that shop adds anchovies to their offerings.  Etc, etc.  If you want a pizza with banana peppers, you call the pizza shop that offers them.  You choose the banana pepper shop and thus you can get a banana pepper pizza.

![Factory UML](https://user-images.githubusercontent.com/22779199/35464505-3200ed70-02c4-11e8-8b4c-fd18e7e54f97.png)

All of the pizza shops (the parent class and child classes) are the Creator classes.
All of the pizzas (the generic pizza method and the customized methods in the child pizza shops) are the Product classes.

The concrete product classes are the only classes that have the knowledge to create concrete products (objects).
