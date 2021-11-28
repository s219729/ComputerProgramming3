package pl.pankalla.weronika;

public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Title: " + super.getTitle() + ", Author: " + this.getAuthor() + " File name: " + fileName);
    }


}
