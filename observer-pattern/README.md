## Observer Pattern

This pattern defines a one to many relationship.  The subject (the "one") holds state.  
When that state changes, the observers (the "many") are notified of that change.
The subject and it's observers are loosely coupled: they can interact without having deep knowledge of one another.
The observers can choose to unregister as an observer and later, reregister to be an observer once more... like an
email newsletter subscriber list.
