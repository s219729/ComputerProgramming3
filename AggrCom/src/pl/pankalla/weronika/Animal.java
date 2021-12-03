package pl.pankalla.weronika;

public class Animal {
    private String name;
    private int age;
    private int numberOfLegs;

    public Animal(String name, int age, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }


    public void sound(){
        System.out.println("Szzzzzz");
    }

    public int getAge(){
        return this.age;
    }
}
