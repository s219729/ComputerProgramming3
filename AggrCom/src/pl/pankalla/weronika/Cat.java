package pl.pankalla.weronika;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, 4);
    }

    public void sound() {
        super.sound();
        System.out.println("Miau miau");
    }
}
