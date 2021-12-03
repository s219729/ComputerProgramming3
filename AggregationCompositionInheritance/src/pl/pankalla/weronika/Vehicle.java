package pl.pankalla.weronika;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }
    public void hong(){
        System.out.println("Tuuut, tuuut!");
    }

    public void display(){
        System.out.println("Vehicle brand: " + this.brand);
    }

    public void sound() {
        System.out.println("Vehicle");
    }
}
