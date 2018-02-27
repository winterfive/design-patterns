## Adapter Pattern

This pattern uses interfaces to allow an object or data or input to be treated like other another object, data, or input.

If it walks like a cat and talks like a cat, it might be a pug using a cat adapter.
  
For example, you have legacy code that accepts a certain type of input.  A new customer also has data
to input but the type is different.  Instead of rewriting your old code to accept the new data type,
you can create an interface that allows the new data to be treated like the old data type.

## Two types of Adapters: Class and Object

Object: Uses interfaces, an object can use as many interfaces as it wants.
Class:  The adapter needs to use multiple inheritance (the target and the adaptee).  
	Java requires that a class e limited to one parent class so we can't use
	class adapters with Java.
