// 6.	Create a project where you define a Book class that describes books.
// Add book attributes: title and author. Create a constructor where you assign book attribute values.
// Add accessor and mutator methods for all book attributes.
// Add also a display() method to display information about the book.
// Then write a program that creates and displays two books.
//7.	Add an Ebook class definition to your project that derives from the Book class
// (inherits the Book class attributes and methods). Add an attribute: file name.
// Create a constructor where you assign the ebook attribute values (title, author and file name).
// Add accessor and mutator methods for all ebook attributes.
// Also add a display() method to display information about the ebook.
// Then write a program that creates and displays one book and two e-books.
//8.	Add an Audiobook definition to the project that derives from the Book class
// (inherits the Book class's attributes and methods).
// Add the following attributes in the class: minutes and seconds, which define the duration of the audiobook.
// Create a constructor where you assign audiobook attribute values (title, author, and audiobook duration).


// 9.	Add a Library class definition to your project that contains an attribute
// that stores any books, ebooks, or audiobooks. Apply an array. Consider the correct data type for the array.
// Then write a program that creates and displays one book, two e-books and two audiobooks.
// Save all object in the library. Display the contents of the library.
// Notice which display() object methods are called.
 // Array book, jak zastosujemy petle for - to sam automatycznie przypisze sobie,
// ktory display ma wybrac do ktorego typu, jak to bedzie audiobook to wywola display z audiobook etc.
// W klasie Book, w klasie Library, Audiobook itd. ma byc ta sama nazwa metody display() (a nie np. displayBook() etc.)



package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
	Ebook eBook1 = new Ebook("Lord of the Rings", "J.R.R. Tolkien", "Lord_of_the_Rings_v_1");
	eBook1.display();

	Book eBook2 = new Ebook("Buszujacy w zbozu" , "J.D. Salinger", "Buszujacy_w_zbozu_v_1");
	eBook2.display();

    }
}
