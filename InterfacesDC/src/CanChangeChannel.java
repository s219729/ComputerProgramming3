// 6.	The basic functionalities of the TV set are switching it on and off,
// changing the channel and adjusting the volume level.
// Create a CanOnOff interface that contains methods to turn on and off the TV set: on(), off().
//7.	A TV class describes TV sets. Each TV can be turned on or off.
// Define the class with the appropriate attribute. Add a method that displays TV status.
// 8.	In the TV class, implement the CanOnOff interface. Define methods by which the TV can be turned on and off. Then write a program that:
//a.	Turns on TV
//b.	Displays TV status
//c.	Turns off TV
//d.	Displays TV status
//9.	In addition to switching on and off, TV sets also allow you to change the number of the displayed channel.
// Create a CanChangeChannel interface which contains the methods for changing the channel:
// channelUp(), channelDown(), setChannel(channelNo).

//10.	In the TV class, add an attribute that describes the channel number.
// Then implement the CanChangeChannel interface. Define methods in the class for changing the channel.
// Take into account that:
//a.	The allowed channel number is 1 through 99.
//b.	The channel can only be changed when the TV is on.
//c.	The default channel number after turning on the TV is 1.
//d.	TV status displays channel number only when the TV is on.
//Then write a program that:
//e.	Turns on the TV
//f.	Displays TV status (whether TV is on and channel number)
//g.	Changes channel number to the next one.
//h.	Changes channel number to 7.
//i.	Changes channel number to 142.
//j.	Displays TV status.
//k.	Changes channel number to the previous one.
//l.	Displays TV status.
//m.	Turns off the TV.
//n.	Displays TV status.





public interface CanChangeChannel {


    public void channelUp();
    public void channelDown();



}
