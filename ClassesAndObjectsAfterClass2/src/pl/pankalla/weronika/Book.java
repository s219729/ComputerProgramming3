package pl.pankalla.weronika;

public class Book {
    String title;
    String author;
    int year;
    int pages;
    boolean isAvailable;

    public void displayInfo(){
        System.out.println("Title of the book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("How many pages: " + pages);
    }

    public void changeAvailability(){
        isAvailable = !isAvailable;
        System.out.println("Is this book available: " + isAvailable);
    }

}
