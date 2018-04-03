## Iterator Pattern using Java's built in Iterator

This pattern creates uses Java's built in Iterator to give us access to different types of collections 
(Arrays, ArrayLists, HashMaps, Lists, etc).

![Three different collections: butterflies, stamps, and condiment packets](https://user-images.githubusercontent.com/22779199/38280702-892fe9c2-3742-11e8-9606-0904a6f3db3d.jpg)

- It provides a way to access elements of a collection sequentially w/out exposing the underlying representation.
- The resposibility of traversal is placed on the iterator object, not the aggregate (the collection).

Unlike the non-built in version, our various menues implement the Menu interface.  Our instance of Waitress can refer
to each menu object usng the interface rater then the concrete class.  This reduces the waitress's dependancy
on concreate classes and allows me to code to an interface, not in implementaton (keeping things loosely coupled).

![Built in Iterator UML](https://user-images.githubusercontent.com/22779199/38280758-cbdca27e-3742-11e8-94cc-6db8e9185b98.jpg)

The Menu interface has the createIterator().  Menu is implemented by DinerMenu and PancakeHouseMenu so each 
concrete menu class is responsible for creating it's own iterator that handles it's menu items.

