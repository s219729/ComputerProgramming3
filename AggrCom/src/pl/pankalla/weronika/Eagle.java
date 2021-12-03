package pl.pankalla.weronika;

public class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Jestem orzel!");
    }
}
