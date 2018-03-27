## Iterator Pattern

This pattern uses an iterator interface to give us access to different types of collections (Arrays, 
ArrayLists, HashMaps, Lists, etc).  The client doesn't need to know what kind of collection it is to access it.
Each concrete collection will have a createIterator() to create it's own iterator.  That Iterator instance knows the details of how to interact iwth it's own collection... so the interaction is encapsulated!  

![Basic Iterator UML](https://user-images.githubusercontent.com/22779199/37984281-df1f8f56-31c3-11e8-8575-4171a32960c7.png)  

![Waitress and Menu Iterator diagraphm](https://user-images.githubusercontent.com/22779199/37985327-78bd56c8-31c6-11e8-8f6b-9e99d22f3e3e.jpg) 

