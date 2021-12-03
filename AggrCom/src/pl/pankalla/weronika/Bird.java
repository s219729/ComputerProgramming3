package pl.pankalla.weronika;

public class Bird extends Animal {
    public Bird(String name, int age){
        super(name, age, 2);
    }

    public void sound(){
        super.sound();
        System.out.println("Cwir cwir cwir");
    }

    public void fly(){
        System.out.println("Latam sobie fry fry fry");
    }


}
