## Abstract Factory

Use the Abstract Factory when you want to create families of products and you want them to be created together.

The abstract factory pattern uses interfaces (object composition) to create groups of related or dependent objects without specifying their concrete classes.  For example, the NYPizzaIngrediantFactory and ChicagoPizzaIngrediantFactory classes will implement the IngrediantFactory interface because they are types of ingrediant factories.  The interface doesn't care what kind of pizza the factories make or have any knowledge of how it's made.  

The concrete classes in the abstract pattern often use a factory method to create products.


![UML for Abstract Factory](https://user-images.githubusercontent.com/22779199/35650537-714dd846-06aa-11e8-8f45-185ebf476afc.png)

Changes to the Abstract Factory will require changes to the interface (breaking the OPEN CLOSED PRINCIPLE).


  


