// Zrobilismy podczas zajec w BlueJ, tutaj kopia z BlueJ
// 7.	Working in a group, create Book and Writer classes in a class diagram.
// Define class attributes and methods. Consider that the book has one author.
// Create a relationship between the classes assuming that objects of those classes can exist independently.
// If one is deleted other can still exist. What kind of relationship should be used?
// Mark the multiplicity in the class diagram. Save the class diagram to a graphic file.
//8.	Based on the created class diagram, define the classes in the programming language.
// Put the classes in a separate project. Then write a program that creates objects, assigns them attribute values,
// and calls the available methods.


public class Main {

    public static void main(String[] args) {
        Writer writer1 = new Writer("Terry", "Pratchett", 1948, "English");
        Book book1 = new Book("The Colour of Magic", "fantasy", 1983, writer1);
        System.out.println(writer1);
        book1.displayInfo();

    }
}
