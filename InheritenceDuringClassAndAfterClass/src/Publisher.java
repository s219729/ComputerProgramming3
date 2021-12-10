// 6. Create a project where you define a Book class that describes books.
// Add book attributes: title and author. Create a constructor where you assign book attribute values.
// Add accessor and mutator methods for all book attributes.
// Add also a display() method to display information about the book.
// hen write a program that creates and displays two books.
// 7.	Add an Ebook class definition to your project that derives from the Book class
//  (inherits the Book class attributes and methods). Add an attribute: file name.
//  Create a constructor where you assign the ebook attribute values (title, author and file name).
// Add accessor and mutator methods for all ebook attributes.
// Also add a display() method to display information about the ebook.
// Then write a program that creates and displays one book and two e-books.
// 8.	Add an Audiobook definition to the project that derives from the Book class
// (inherits the Book class's attributes and methods).
// Add the following attributes in the class: minutes and seconds, which define the duration of the audiobook.
// Create a constructor where you assign audiobook attribute values (title, author, and audiobook duration).
// 9.	Add a Library class definition to your project that contains an attribute
// that stores any books, ebooks, or audiobooks. Apply an array. Consider the correct data type for the array.
// Then write a program that creates and displays one book, two e-books and two audiobooks.
// Save all object in the library. Display the contents of the library.
// Notice which display() object methods are called.

//  Array book, jak zastosujemy petle for - to sam automatycznie przypisze sobie,ktory display ma wybrac do ktorego typu,
// jak to bedzie audiobook to wywola display z audiobook etc.
//// W klasie Book, w klasie Library, Audiobook itd. ma byc ta sama nazwa metody display() (a nie np. displayBook() etc.)

// 10.	Add a Publisher class definition to your project that includes the name and city attributes.
// Add a constructor in the class where you assign initial values for the attributes.
// Also add accessor and mutator methods for all attributes.
//11.	Modify the Book class by adding the publisher attribute. Then make the necessary changes to the remaining
// classes to display the library content along with publisher information.
// 13.	Modify the Book class. Add the book's year of publication attribute,
// as well as accessor and mutator methods for this attribute. Then modify other project classes
// and display the library contents.
// 15.	Define a Writer class in your project that describes the writer by his/her first name, last name
// and literary genre. Then, in the Book class, use an object of that class to describe the author of the book.
// Modify other project classes and display the library contents.




public class Publisher {
    private String name;
    private String city;

    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return "publisher name: " + this.name + ", publisher city: " + this.city;
    }


}
