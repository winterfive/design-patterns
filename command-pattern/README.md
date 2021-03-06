## Command Pattern

Use the command pattern when you need to decouple an object that makes requests from an
object that knows how to perform the requests.

![A remote controlled garage door](https://user-images.githubusercontent.com/22779199/36812995-f42aa31e-1ca0-11e8-9a91-492ee527f679.jpg)

This pattern encapsulates a request as an object.

The request (such as close()), the invoker (a garage remote control), and the item the request acts on (the garage door) are all separate objects.  

The invoker contains a method to act on any request (setCommand()).  This method is parameterized: it can accept any 
request as an object (closeGarageDoor).  It sets or loads the invoker with a task.  Once loaded up, the request can be 
completed by calling the invoker's method (such as ButtonWasPressed(), engage(), etc) to call the execute method (shared with all 
command objects through the command interface) on whatever item the request acts on.  Each command will define what
execute() should be for itself.

For this example, I have three types of classes: my clients classes, my command classes, and my controllable classes.

### This command class turns off a light.

    public class LightOffCommand implements Command{
      Light light;

      public LightOffCommand(Light light) {
        this.light = light;
      }

      public void execute() {
        light.off();		
      }	
    }

### The light (a controllable) will define how it's turned off

    public class Light {

      public void on() {
        System.out.println("The light is on.");		
      }	

      public void off() {
        System.out.println("The light is off.");
      }
    }
   
### The remote (client) loads the request

    public class SimpleRemoteControl {
      Command slot;
      public SimpleRemoteControl() {}

      /*
       * Sets the command that will be executed
       * when the button on the remote is pressed
       */
      public void setCommand(Command command) 	{
        slot = command;
      }

      /*
       * Button is pressed so the command loaded
       * into slot is executed.
       */
      public void buttonWasPressed() {
        slot.execute();
      }
    }
 
 ![Command Pattern UML](https://user-images.githubusercontent.com/22779199/35943156-29932e62-0c26-11e8-9212-1a92357d066c.png)
