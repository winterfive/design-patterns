## Command Pattern  

This pattern encapsulates a request as an object.  The request (such as close()), the invoker
(a remote control), and the item the request acts on (a garage door) are all separate objects.
The invoker contains a method to act on any request (setCommand()).  This method is parameterized: it can accept any 
request as an object (closeGarageDoor).  It sets or loads the invoker with a task.  Once loaded up, the request can be completed by calling the invoker's method (such as OnButtonWasPressed()) to call the execute method (shared with all command objects through the command interface) on whatever item the request acts on.  Each command will define what execute() should be for itself.

