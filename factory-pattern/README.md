Factory Pattern

The factory pattern encapsulates object creation.  An abstract creator class (the parent class) defines abstract factory methods that the subclasses use to create their own custom implementations of objects. 

A real life example would be the franchising of a pizza shop.  All of the pizza shops would have the generic (abstract) procedures to make a pizza(bake, add toppings, put it in a box, slicing, etc).  They inherit those from original pizza shop (the abstract pizza shop AKA the parent class)  The individual shops could use those handed down procedures and customize them.  One shop has a clientele that likes banana peppers on their pizza so they change the process in their shop to add banana peppers.  Another franchisee has customers that like anchovies (yum!) so that shop adds anchovies to their offerings.  Etc, etc.  

All of the pizza shops(the parent class and child classes) are be the Creator classes.
All of the pizza (the generic pizza method and the customized methods in the child pizza shops) are the Product classes.

