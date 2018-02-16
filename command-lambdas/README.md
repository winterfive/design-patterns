## Command Pattern w/ lambdas & method references

Use the command pattern when you need to decouple an object that makes requests from an object that knows how to  
perform the requests.

In this version of the Command pattern, we use lambdas and method references to minimize  
the nuber of classes we need to create.  Instead of having lots of small classes, we use  
lambda expressions to elimanate the need for all of the specific command classes.

### Lambdas

Light livingRoomLight = new Light("living room");
LightOnCommand livingRoomLightOn = new LightOnCommand();
LightOffCommand livingRoomLightOff = new LightOffCommand();

remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);

- becomes -  

Light livingRoomLight = new Light("living room");
remote.setCommand(0, () -> { livingRoomLight.On(); }, () -> { livingRoomLight.Off(); });  

The lambda calls the execute().  This can only be used if execute() and the lambda expression have matching  
signatures(same amount of arguements, same return type if any).

### Method References  

If the lambda calls one and only one method, you can replace it with a method reference.  

remote.setCommand(0, livingRoomLight::on, livingRoomLight::off);
