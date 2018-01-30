## Observer Pattern

This pattern defines a one to many relationship.  The subject (the "one") holds state.  
When that state changes, the observers (the "many") are notified of that change.
The subject and its observers are loosely coupled: they can interact without having deep knowledge of one another.
The observers can choose to unsubscribe as an observer and later, resubscribe to be an observer once more... just like an
email newsletter subscriber list or a weather update app.

This example of the Observer pattern will update a guest at a theme park when the wait time for the Hulk Coaster changes.  It does not use Java's built-in support.

![UML for Observer Pattern](https://user-images.githubusercontent.com/22779199/35053709-e2a9d28e-fb78-11e7-9952-60451e3ec22f.png)  

## Tips

Your Observers won't receive notifications in any specific order so don't expect it.  

The built in java.util.Observable can only be used for certain implementations.  
  - Observable is a class so you have to subclass it to use it.  You can't add the Observable behavior to an already existing child class (one class, one parent).  
  - There is no Observable interface so you can't create your own implementation that will work well with the built-in API.  
  
You can push or pull data from the Observable (pull is usually the way to go).  
  
