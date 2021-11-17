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

public class Person {
    // Class attributes
    String name;
    double weight;
    double height;
    double bmi;

    // First Constructor
    public Person(String name){
        this.name = name;
    }

    // Second Constructor
    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    //Behaviours
    public void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        bmi = (weight / ((height/100) * (height/100)));
        return bmi;
    }

    public void displayRecord(){
        System.out.println("Your name: " + name);
        System.out.println("Your weight: " + weight);
        System.out.println("Your height: " + height);
        System.out.println("The correct BMI value is 18.5 to 24.9. ");
        System.out.println("Your BMI is: " + calculateBMI());
        if(calculateBMI() < 18.5){
            System.out.println("BMI too low");
        } else if(calculateBMI() > 24.9){
            System.out.println("BMI too high");
        } else {
            System.out.println("Your BMI is fine");
        }

    }
}
