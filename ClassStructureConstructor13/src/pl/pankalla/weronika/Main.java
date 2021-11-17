// 13.	Define a class Person for person’s record.
// The class should contain the attributes: name, weight (kg) and height (cm). Add constructors:
//a.	Person(name)
//b.	Person(name,weight,height)
//Then add methods that represents the object's behaviors:
//c.	setWeightAndHeight(weight,height)
//d.	calculateBMI() – calculates Body Mass Index
//e.	displayRecord() – displays full info (name, weight, height, and BMI)
//The correct BMI value is 18.5 to 24.9.
// When displaying a person’s record, if the BMI is too low, display the message: "BMI too low".
// When the index is too high, display the message: "BMI too high".
// Write a program, create three persons and display their records.



package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person("Natalia");

        Person secondPerson = new Person("Weronika", 50, 166);

        Person thirdPerson = new Person("Tomek", 85, 175);

        firstPerson.setWeightAndHeight(55,165);
        firstPerson.displayRecord();

        secondPerson.displayRecord();
        thirdPerson.displayRecord();

    }
}
