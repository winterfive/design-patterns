## Singleton Pattern

This pattern make sure that there's only one of itself at any time and it provides global access to that one instance ( getInstance() ).

A RL example, you can use a singleton to monitor and control access to a single resource, such as a printer that's used by several workers in one office.  The queue would be controlled by a singleton because the printer can only print one job at a time.  The other files must wait.

![UML for Singleton](https://user-images.githubusercontent.com/22779199/35828922-41417b9c-0a8f-11e8-858c-84d84f56b56e.png)
