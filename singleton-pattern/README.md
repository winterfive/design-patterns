## Singleton Pattern

This pattern make sure that there's only one of itself at any time and it provides global access to that one instance ( getInstance() ).

A RL example, you can use a singleton to monitor and control access to a single resource, such as a printer that's used by several workers in one office.  The queue would be controlled by a singleton because the printer can only print one job at a time.  The other files must wait.

