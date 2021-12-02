// 13.	The Best Books publishing house releases crime, drama, fantasy, and science fiction  books.
// Consider what attributes can be used to describe the books. Then create a class diagram containing books attributes.
// Finally, define the class based on the created class diagram.




package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        PublishingHouse newPublish = new PublishingHouse();
        newPublish.setBooksReleased(10);
        newPublish.displayGenres();
    }
}
