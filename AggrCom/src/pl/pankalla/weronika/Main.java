package pl.pankalla.weronika;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Owner firstOwner = new Owner("Tomek");
        Animal dog = new Dog("Eti", 1, firstOwner);
        Animal cat = new Cat("Negra", 2);
        Animal eagle = new Eagle("Ziutek", 5);
        Animal penguin = new Penguin("Pingwiniasty", 10);
        // eagle.fly();


        Dog dog2 = new Dog("Eti", 1, new Owner("Weronika"));
        Cat cat2 = new Cat("Negra", 2);
        Eagle eagle2 = new Eagle("Ziutek", 5);
        Penguin penguin2 = new Penguin("Pingwiniasty", 10);
        eagle2.fly();
        Bird eagle3 = new Eagle("Ziutek", 5);
        Bird penguin3 = new Penguin("Pingwiniasty", 10);

        List<Animal> zoo = new ArrayList<Animal>();
        zoo.add(dog);
        zoo.add(cat2);
        zoo.add(eagle3);

        for(Animal animal : zoo){
            animal.sound();
//            if(animal instanceof Bird) {
//                ((Bird) animal).fly();
//            }
        }

        List<Bird> birdCage = new ArrayList<Bird>();
        birdCage.add(eagle2);
        birdCage.add(penguin2);
        // Tak nie mozna, bo ten penguin jest typu Animal: birdCage.add(penguin);
        // birdCage.add(dog2);

        for(int i = 0; i < birdCage.size(); i++){
            birdCage.get(i).fly();
        }





    }
}
