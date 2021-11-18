// 17.	The following definition of the StudentGrades class allows the storage of a student's grades.

//public class StudentGrades {
//
//    String studentName;
//    double[] grades;
//
//    StudentGrades(String name, double[] grades) {
//        this.studentName = name;
//        this.grades = grades;
//    }
//}
//Complete the class with methods that:
// a.	calculates of the lowest grade
// b.	calculates of the highest grade
// c.	calculates of the number of grades
// d.	calculates of the grade point average
// e.	displays student’s record with student’s name, a list of the student's grades,
// number of grades, lowest grade, highest grade, and grade point average

//Then, write a program that creates grades for two students:
// f.	Amanda: 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5
// g.	James: 2.0, 3.0, 2.0, 4.5, 4.5
//Tip: pass student's grades to the constructor, as an array, in curly brackets, e.g. StudentGrades({5.0, 3.5}).


// 18.	Add the constructor StudentGrades(String name, int numberOfGrades) to the StudentGrade class,
// which allows you to randomly create the given number of student grades. Tip: use the random number generator,
// which is available in the Random class. See the manual for more information.
// 19.	Add the constructor StudentGrades(String name) that allows you to enter student’s grades from the keyboard.
// Tip: use the Scanner class. See the manual for more information.


package pl.pankalla.weronika;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        double[] randomGrades = new double[numberOfGrades];
        Random random = new Random();
        for(int i=0; i<numberOfGrades; i++){
            randomGrades[i] = random.nextInt(5 - 1) + 1;
        }
        this.grades = randomGrades;
    }

    StudentGrades(String name){
        this.studentName = name;
        System.out.println("Please enter grades, delimited by comma, eg. 4,5,2");
        System.out.println("\n");
        Scanner newScanner = new Scanner(System.in);
        String input = newScanner.next();
        String[] stringGrades= input.split(",");
        this.grades = Arrays.stream(stringGrades)
                .mapToDouble(Double::parseDouble)
                .toArray();
//        System.out.println(input);
    }

    // calculates of the lowest grade
    public double lowestGrade(){
        return Arrays.stream(this.grades).min().getAsDouble();
    }

    // calculates of the highest grade
    public double highestGrade(){
        return Arrays.stream(this.grades).max().getAsDouble();

    }

    // calculates of the number of grades
    public int numberOfGrades(){
        return this.grades.length;

    }

    // calculates of the grade point average
    public double gradePointAverage(){
        double sum = 0.0;
        int count = this.numberOfGrades();
        for (int i=0; i<count; i++){
            sum += this.grades[i];
        }
        return sum/count;
    }


    // displays student’s record with student’s name, a list of the student's grades,
    // number of grades, lowest grade, highest grade, and grade point average

    public void displayInfo(){
        System.out.println("Student's name: " + studentName);
        System.out.println("Student's grades: " + Arrays.toString(grades));
        System.out.println("Number of grades: " + numberOfGrades());
        System.out.println("Lowest grade: " + lowestGrade());
        System.out.println("Highest grade: " + highestGrade());
        System.out.println("Grade point average: " + gradePointAverage());
    }
}