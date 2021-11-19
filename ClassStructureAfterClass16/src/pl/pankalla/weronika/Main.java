//16.	There are many devices that can use the Internet: a personal computer, laptop, tablet,
// smartphone, internet radio or TV.
// Define an InternetDevice class to describe such devices.
// The class should contain attributes: name (device name), connected (whether a device is connected to the Internet),
// and connectedDevices (the number of connected devices - static field).
// Add a constructor InternetDevice(name) and methods for device manipulation: connect(), disconnect(),
// isConnected(), displayStatus(), displayConnections() (static method).
// Then write a program that creates five different internet devices, three of which are connected to the Internet.
// Display the status of each device and information about the number of devices connected to the Internet.


package pl.pankalla.weronika;


public class Main {

    public static void main(String[] args) {
        InternetDevice computer = new InternetDevice("Computer");
        computer.connect();
        computer.isConnected();
        computer.displayStatus();
        InternetDevice.displayConnections();

        InternetDevice laptop = new InternetDevice("Laptop");
        laptop.connect();
        laptop.isConnected();
        laptop.displayStatus();
        InternetDevice.displayConnections();

        InternetDevice tablet = new InternetDevice("Tablet");
        tablet.connect();
        tablet.isConnected();
        tablet.displayStatus();
        InternetDevice.displayConnections();

        InternetDevice smartphone = new InternetDevice("Smartphone");
        smartphone.disconnect();
        smartphone.isConnected();
        smartphone.displayStatus();
        InternetDevice.displayConnections();

        InternetDevice tv = new InternetDevice("TV");
        tv.disconnect();
        tv.isConnected();
        tv.displayStatus();
        InternetDevice.displayConnections();






    }
}
