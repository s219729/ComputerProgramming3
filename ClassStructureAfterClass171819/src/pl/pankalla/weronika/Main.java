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

public class Main {

    public static void main(String[] args) {
//        StudentGrades firstStudent = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
//        firstStudent.displayInfo();
//        StudentGrades secondStudent = new StudentGrades("James", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});
//        secondStudent.displayInfo();
//
//        StudentGrades thirdStudent = new StudentGrades("Weronika", 10);
//        thirdStudent.displayInfo();

        StudentGrades fourthStudent = new StudentGrades("Puper");
        fourthStudent.displayInfo();


    }
}
