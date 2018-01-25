## Observer Pattern w/ Swing & Lambda Expressions

This pattern defines a one to many relationship. The subject (the "one") holds state.
When that state changes, the observers (the "many") are notified of that change. The subject and its observers
are loosely coupled: they can interact without having deep knowledge of one another. The observers can choose
to unsubscribe as an observer and later, resubscribe to be an observer once more... just like an email newsletter subscriber list.

This example uses Swing to create a simple two button pop-up and lambda expressions to minimize code.