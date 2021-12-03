package pl.pankalla.weronika;

public class Dog extends Animal {
    private Owner owner;
    private Health health = new Health("good health");

    public Dog(String name, int age, Owner owner) {
        super(name, age, 4);
        this.owner = owner;

    }

    public void sound(){
        super.sound();
        System.out.println("Hau hau");
        System.out.println("Dog age: " + this.getAge());
    }

}
