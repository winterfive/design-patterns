## Iterator Pattern using Java's built in Iterator

This pattern creates an iterator interface to give us access to different types of collections 
(Arrays, ArrayLists, HashMaps, Lists, etc).

The client doesn't need to know what kind of collection it is to access it. 
Each concrete collection will have a createIterator() to create it's own iterator. 
That Iterator instance knows the details of how to interact with it's own collection... 
so the interaction is encapsulated!
