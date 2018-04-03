## Iterator Pattern using Java's built in Iterator

This pattern creates uses Java's built in Iterator to give us access to different types of collections 
(Arrays, ArrayLists, HashMaps, Lists, etc).

- It provides a way to access elements of a collection sequentially w/out exposing the underlying representation.
- The resposibility of traversal is placed on the iterator object, not the aggregate (the collection).

Unlike the non-built in version, our various menues implement the Menu interface.  Our instance of Waitress can refer
to each menu object usng the interface rater then the concrete class.  This reduces the waitress's dependancy
on concreate classes and allows me to code to an interface, not in implementaton (keeping things loosely coupled).  

The Menu interface has the createIterator().  Menu is implemented by DinerMenu and PancakeHouseMenu so each 
concrete menu class is responsible for creating it's own iterator that handles it's menu items.

