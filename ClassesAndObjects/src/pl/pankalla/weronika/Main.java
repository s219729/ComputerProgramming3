// 7.	In the Java programming language, define a Student class. Pay attention to the class name and the file where the class is defined.
//8.	In the Student class, add name and age fields to represent the object's attributes. Pay attention to the necessity to specify the attribute types.
//9.	Create two Student class objects. Assign values to the object fields. What are the object field properties.
//10.	In the Student class, add methods (method headers only) that represent the behaviors of the object:
//a.	sayHello()
//b.	displayName()
//c.	displayAge()
//Then enter the statements in the methods to display the appropriate information.
//11.	Create three Student class objects. Assign values to the object fields. Then call the methods.
//12.	Add the following fields and methods to the Student class to represent object attributes and behaviors:
//a.	Object attributes: (1) student ID card, (2) whether the student ID card is valid or not, (3) semester number, (4) average grade
//b.	Object behaviors: (1) display the student’s name, semester number and average grade, (2) change the status of student ID card (valid/invalid), (3) display the student’s name, ID card number and whether the ID card is valid
//Then create two Student class objects, assign them some values and call methods.

package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "Weronika";
        firstStudent.age = 25;
        firstStudent.idCard = "234";
        firstStudent.isIdValid = true;
        firstStudent.semesterNumber = 3;
        firstStudent.averageGrade = 4.5;

        Student secondStudent = new Student();
        secondStudent.name = "Tomek";
        secondStudent.age = 25;
        secondStudent.idCard = "123";
        secondStudent.isIdValid = false;
        secondStudent.semesterNumber = 5;
        secondStudent.averageGrade = 5.0;

        Student thirdStudent = new Student();
        thirdStudent.name = "Agnieszka";
        thirdStudent.age = 29;
        thirdStudent.idCard = "567";
        thirdStudent.isIdValid = true;
        thirdStudent.semesterNumber = 2;
        thirdStudent.averageGrade = 3.5;


        firstStudent.sayHello();
        firstStudent.displayName();
        firstStudent.displayAge();
        firstStudent.displayNameSemesterGrade();
        firstStudent.changeIdStatus();
        firstStudent.displayNameCheckIfValidId();

        secondStudent.sayHello();
        secondStudent.displayName();
        secondStudent.displayAge();
        secondStudent.displayNameSemesterGrade();
        secondStudent.changeIdStatus();
        secondStudent.displayNameCheckIfValidId();

        thirdStudent.sayHello();
        thirdStudent.displayName();
        thirdStudent.displayAge();
        thirdStudent.displayNameSemesterGrade();
        thirdStudent.displayNameCheckIfValidId();
        thirdStudent.changeIdStatus();
        thirdStudent.displayNameCheckIfValidId();
        
    }
}
