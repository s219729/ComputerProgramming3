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

import java.util.Arrays;

public class InternetDevice {
    String deviceName;
    boolean connected;
    static int connectedDevices = 0;

    //Declaring an static array, that will have 3 elements
    static String[] array = new String[3];

    //Creating constructor
    InternetDevice(String name){
        this.deviceName = name;
        }

    public void connect(){
        if(this.connected==false){
            this.connected = true;
            connectedDevices += 1;
            array[connectedDevices-1] = this.deviceName;
        }
    }

    public void disconnect(){
        if(this.connected==true){
            this.connected = false;
            connectedDevices -= 1;
        }
    }

    public boolean isConnected(){
        if(this.connected) {
            System.out.println(this.deviceName + " is connected to the Internet");
            return true;
        } else {
            System.out.println(this.deviceName + " is not connected to the Internet");
            return false;
    }}

    public void displayStatus(){
        System.out.println("These devices are connected: " + Arrays.toString(array));

    }

    public static void displayConnections(){
        System.out.println("There are " + connectedDevices + " connected devices");
    }


}
