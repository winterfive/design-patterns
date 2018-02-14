## Command Pattern (Expanded)

In this expanded Command pattern, we have a lot more command classes with more functionality(undo(), various speeds verses just off and on, and a macro command[]).

Client -> remoteControl -> <interface>Command -> LightOnCommand -> Light instance  
  
Client -> setCommand/onButtonWasPushed() -> execute() -> execute() { lightOn(); }

I changed the code from the book to allow the Light class, the LightOnCommand class, and the LightOffCommand class to work for any light in the house or garage instead of having special garage light command classes.

The ceiling fan command classes contain an undo() that uses a prevSpeed field (int) to undo the previous request.

This code also contains a two macro commands (Command[]s) that execute four different commands on four different objects via one request.  The macro also has an undo() that undoes everything that was done with one request.
 

![UML for Command Expanded](https://user-images.githubusercontent.com/22779199/36164358-19d39a6e-10ba-11e8-8979-fe082db88b6d.jpg)


The Remote classes(Client, RemoteControl) are decoupled from the vendor classes(Light, GarageDoor, etc).  This pattern follows the OPEN CLOSED PRINCIPLE.

This pattern has a lot of small classes in it: the client, the invoker, the commands (on, off, turn, spinAtLowSpeed, whatever), and the objects(the receivers).





