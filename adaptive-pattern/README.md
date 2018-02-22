## Adapter Pattern

This pattern converts an interface of a class into another interface that the clients expect.  
For example, you have legacy code that accepts a certain type of input.  A new customer also has data
to input but the type is different.  Instead of rewriting your old code to accept the new data type,
you can create an interface that allows the new data to be treated like the old data type.

## Two types of Adapters: Class and Object

Object: Using interfaces means an object can use as many interfaces as it wants.
Class:  In Java, a class can only have one parent class.  The class adapter needs to use
	multiple inheritance so you can't do this in Java.