## Iterator Pattern

This pattern uses an iterator interface to give us access to different types of collections (Arrays, 
ArrayLists, HashMaps, Lists, etc).  The client doesn't need to know what kind of collection it is to access it.
Each concrete collection will have a createIterator() to create it's own iterator.  That Iterator instance knows the details of how to interact with it's own collection... so the interaction is encapsulated!  

![Basic Iterator UML](https://user-images.githubusercontent.com/22779199/37984281-df1f8f56-31c3-11e8-8575-4171a32960c7.png)  

The UML below shows the code in this folder.  We've got two menus that are very similar(they both use createIterator() and addItem()).  Thw waitress class currently has to deal with each menu seperately(breaking the "Do not depend on concrete classes" rule). Since they share methods, I will create an interface to deal with that, removing some responsibility from the waitress.  I'll do that in the built-in implementation of Iterator.

![Waitress and Menu Iterator diagraphm](https://user-images.githubusercontent.com/22779199/37985327-78bd56c8-31c6-11e8-8f6b-9e99d22f3e3e.jpg) 

