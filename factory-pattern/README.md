Factory Pattern

The Factory Pattern allows you to encapsulate object creation ("new").  Abstract object creation methods 
are passed down to concrete subclasses that can define them in their own way.  Abstract classes cannot 
instantiate objects.  The subclasses are responsible for the creation of objects via a factory class.  
This decouples the client code in the superclass from the object creation code in the subclasses.

TEST