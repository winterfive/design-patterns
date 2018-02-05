## Singleton Pattern

This pattern make sure that there's only one of itself at any time and it provides global access to that one instance (static getInstance()).

A RL example, you can use a singleton to monitor and control access to a single resource, such as a printer that's used by several workers in one office.  The queue would be controlled by a singleton because the printer can only print one job at a time.  The other files must wait.

![UML for Singleton](https://user-images.githubusercontent.com/22779199/35828922-41417b9c-0a8f-11e8-858c-84d84f56b56e.png)

We have a couple options to make absolutely sure there's only one instance of our singleton class.  
Each has it's drawbacks:
- Synchronization of the getInstance method (expensive).
- Change the instantiation from lazy(in the getInstance()) to eagerly created (instantiated in the static variable).  If your singleton is big or never used, then you are wasting resources.
- Use double-checked locking w/ synchronization along with adding the volitile keyword to the static variable.  This doesn't work for Java 2, version 5 or earlier versions.
- If you are using JVM 1.1 or earlier, you need to create a registry of Singletons to avoid garbage collection.

Tip: If you have lots of singletons in your design, you are doing it wrong.

