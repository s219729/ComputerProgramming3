public class Book {
    private String title;
    private Writer author;
    private int publishYear;
    private Chapter firstChapter = new Chapter("Chapter One. The Beginning of the Journey", 36, 3);

    public Book(String title, Writer writer, int publishYear){
        this.title = title;
        this.author = writer;
        this.publishYear = publishYear;
    }

    public void display(){
        System.out.println("Title of the book: " + this.title);
        System.out.println("Author of the book: " + this.author.getName() + " " + this.author.getSurname());
        System.out.println("Year of publishing: " + this.publishYear);
        System.out.println("Title of the first chapter: " + this.firstChapter.getTitle());
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthorNameSurname(){
        return this.author.getName() + " " + this.author.getSurname();
    }


}
