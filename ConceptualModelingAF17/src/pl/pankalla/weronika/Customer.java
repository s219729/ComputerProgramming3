package pl.pankalla.weronika;

public class Customer {
    private String name;
    private int age;

    Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void display(){
        System.out.println(getName());
        System.out.println(getAge());
    }

}
