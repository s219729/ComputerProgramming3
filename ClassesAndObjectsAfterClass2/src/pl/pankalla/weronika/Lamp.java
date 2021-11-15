package pl.pankalla.weronika;

public class Lamp {
    String model;
    boolean isOn;

    public void switchOn(){
        isOn = true;
    }

    public void switchOff(){
        isOn = false;
    }

    public void onOrOff(){
        System.out.println("Is this lamp on? " + isOn);
    }
}
