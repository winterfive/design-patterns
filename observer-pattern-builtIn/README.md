## Observer Pattern

This version of the observer pattern uses Java's built-in support (java.util.Observable and java.util.Observer).

This pattern defines a one to many relationship. The subject (the "one") holds state.
When that state changes, the observers (the "many") are notified of that change. The subject and its observers
are loosely coupled: they can interact without having deep knowledge of one another. The observers can choose
to unsubscribe as an observer and later, resubscribe to be an observer once more... just like an email newsletter subscriber list.

This example of the Observer pattern will update a guest at a theme park when the wait time for the 
Hulk Coaster changes. 

![UML for Observer2](https://user-images.githubusercontent.com/22779199/35059310-b10e1716-fb88-11e7-83b5-f7d68237c9bf.png)  

The downsides of using the built-in Observable:  
- Observable is a class and it has to be subclassed.  A class can have only one parent class.  This setup limits reuse.
- Observable isn't an interface.  You can't create your own implementation that will work well with the built-in API.  
- The setChanged() is protected.  You can't call it unless you've subclasses Observable.  
  This violates the composition > inheritance rule.
