## Abstract Factory

The abstract factory pattern uses interfaces (object composition) to create groups of related or dependent objects without specifying their concrete classes.  For example, the CheesePizza and VeggiePizza classes will implement the Pizza interface because they are types of pizza.  The interface doesn't care what kind of pizza is made or have any knowledge of how it's made.  The abstract client (Pizza) is decoupled from the concrete classes (all the different types of pizza).  The concrete classes in the abstract pattern often use a factory method to create products.


![UML for Abstract Factory](https://user-images.githubusercontent.com/22779199/35650537-714dd846-06aa-11e8-8f45-185ebf476afc.png)

## Tip

- Use the Abstract Factory when you want to create families of products and you want them to be created together.

- Changes to the Abstract Factory will require changes to the interface (breaking the OPEN CLOSED PRINCIPLE).


  


