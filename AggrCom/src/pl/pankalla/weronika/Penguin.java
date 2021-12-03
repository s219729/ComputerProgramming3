package pl.pankalla.weronika;

public class Penguin extends Bird {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Ping ping ping");
    }

    @Override
    public void fly() {
        System.out.println("Nie umiem latac :(");
    }
}
