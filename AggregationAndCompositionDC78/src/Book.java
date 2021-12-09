public class Book {
    private String title;
    private String type;
    private int publishYear;
    private Writer author;


    Book(String title, String type, int publishYear, Writer author)
    {
        this.title = title;
        this.type = type;
        this.publishYear = publishYear;
        this.author = author;
    }

    public void displayInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Type: " + this.type);
        System.out.println("Author: " + this.author);
        System.out.println("Published: " + this.publishYear);
    }

    public String toString(){
        return "title: " + title + " author: " + this.author.getName();
    }
}
