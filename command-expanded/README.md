## Command Pattern (Expanded)

Use the command pattern when you need to decouple an object that makes requests from an
object that knows how to perform the requests.

![A waitress and a cook in a diner](https://user-images.githubusercontent.com/22779199/36813758-98596720-1ca3-11e8-85f3-5fce11568654.PNG)  

The waitress doesn't know how to cook.  The cook doesn't know how to take orders.   
They do know how to interact to get things done.

In this expanded Command pattern, we have a lot more command classes with more functionality (such as undo(), 
various speeds verses just off and on, and a macro command[]).

I changed the code from the book to allow the Light class, the LightOnCommand class, and the 
LightOffCommand class to work for any light in the house or garage instead of having special 
garage light command classes (OOP, DRY).

This code also contains a two macro commands (two command[]) that execute four different commands 
on four different objects via one request.  The macro also has an undo() that undoes everything 
that was done with one request.
 

![UML for Command Expanded](https://user-images.githubusercontent.com/22779199/36164358-19d39a6e-10ba-11e8-8979-fe082db88b6d.jpg)


The Remote classes(Client, RemoteControl) are decoupled from the vendor classes(Light, GarageDoor, etc).  
This pattern follows the OPEN CLOSED PRINCIPLE.

This pattern has a lot of small classes in it: the client, the invoker, the commands (on, off, turn, 
spinAtLowSpeed, whatever), and the objects (the receivers).





