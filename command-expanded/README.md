## Command Pattern (Expanded)

In this pattern, the client(RemoteControlTest) can use a remote control class to call a generic on() or off() that calls an execute() on several different decoupled objects(doors, lights, etc).  The Command interface is implemented by all Command classes, requiring the execute().  Each Command holds a reference to the instance of the appropriate vendor class.  


The Remote classes(Client, RemoteControl) are decoupled from the vendor classes(Light, GarageDoor, etc).  This pattern follows the OPEN CLOSED PRINCIPLE. 





