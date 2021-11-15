package pl.pankalla.weronika;

public class Student {
    String name;
    int age;
    String idCard;
    boolean isIdValid;
    int semesterNumber;
    double averageGrade;

    public void sayHello(){
        System.out.println("Hello!");
    }
    public void displayName(){
        System.out.println("My name is " + name);
    }
    public void displayAge(){
        System.out.println("My age is " + age);
    }

    public void displayNameSemesterGrade(){
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semesterNumber);
        System.out.println("Average grade: " + averageGrade);
    }
    public void changeIdStatus(){
        isIdValid = !isIdValid;
    }
    public void displayNameCheckIfValidId(){
        System.out.println("Name: " + name);
        System.out.println("ID Card number: " + idCard);
        System.out.println("ID Card valid: " + isIdValid);
    }

}
