## Command Pattern (Expanded)

In this pattern, the client(RemoteControlTest) can use a remote control class to call a generic on() or off() that calls an execute() on several different decoupled objects(doors, lights, etc).  The Command interface is implemented by all Command classes, requiring the execute().  Each Command holds a reference to the instance of the appropriate vendor class.

I changed the code from the book to allow the Light class, the LightOnCommand class, and the LightOffCommand class to work for any light in the house or garage instead of having special garage light command classes.

The ceiling fan command classes contain an undo() that uses a prevSpeed field (int) to undo the previous request.

This code also contains a two macro commands (Command[]) that execute four different commands on four different objects via one request.

![UML for Command Expanded](https://user-images.githubusercontent.com/22779199/36164358-19d39a6e-10ba-11e8-8979-fe082db88b6d.jpg)


The Remote classes(Client, RemoteControl) are decoupled from the vendor classes(Light, GarageDoor, etc).  This pattern follows the OPEN CLOSED PRINCIPLE. 





