package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "Weronika";
        firstStudent.age = 25;
        System.out.println("First student is " + firstStudent.name);
        System.out.println("And her/his age is " + firstStudent.age);
    }
}
