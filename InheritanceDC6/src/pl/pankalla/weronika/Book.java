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



package pl.pankalla.weronika;

// Klasa nadrzedna

public class Book {
    public String title;
    public String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }




}
