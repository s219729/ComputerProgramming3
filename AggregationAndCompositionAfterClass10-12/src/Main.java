// 10.	Books can be placed on a bookcase. Create a class diagram.
// Use the previously defined Book and Writer classes (created diagram should contain three classes).
// Assume that the bookcase can hold any number of books.
// When creating a class diagram, pay attention to the relationships between classes,
// taking into account that the book can exist independently of the bookcase.
// Mark the multiplicity in the class diagram. Then, based on the class diagram,
// write a program that allows books to be placed in and removed from the bookshelf.
// Display the bookcase contents.
//11.	Add a Chapter class to the diagram that you have created, describing the chapter in a book
// (chapter title, number of pages, starting page number). Assume that a book can contain any number of chapters.
// What is the relationship between the book and chapters? Can a chapter exist without a book?
// Then modify the program for operating the bookshelf.
//12.	Create a class diagram that contains at least four classes, according to your own choice.
// Add class components and the relationships between the classes. Mark the multiplicity in the class diagram.
// 10 – powinnismy wykorzystać tablicę dynamiczną
//11 – dojdzie czwarta klasa do diagramu klas,
//12 - wlasciwie to co było zrobione w 9,10,11, tylko dobrze ogarnąć relacje itd.




public class Main {

    public static void main(String[] args) {
        Writer writer1 = new Writer("J.D", "Salinger", 1919);
        Writer writer2 = new Writer("Terry", "Pratchett", 1948);
        Book book1 = new Book("The Catcher in the Rye", writer1, 1951);
        Book book2 = new Book("Nine Stories", writer1, 1953);
        Book book3 = new Book("The Colour of Magic", writer2, 1983);
        Book book4 = new Book("Mort", writer2, 1987);

        writer1.display();
        writer2.display();
        book1.display();
        book2.display();
        book3.display();
        book4.display();

        Bookcase bookcase1 = new Bookcase();
        bookcase1.addBook(book1);
        bookcase1.addBook(book2);
        bookcase1.addBook(book3);
        bookcase1.addBook(book4);


        // bookcase1.displayTitles();
        bookcase1.displayTitlesAndAuthors();

        bookcase1.removeBook(book2);
        bookcase1.displayTitlesAndAuthors();

    }
}
