// 13.	The Best Books publishing house releases crime, drama, fantasy, and science fiction  books.
// Consider what attributes can be used to describe the books. Then create a class diagram containing books attributes.
// Finally, define the class based on the created class diagram.



package pl.pankalla.weronika;

import java.util.Arrays;

public class PublishingHouse {
    private String[] genres = {"crime", "drama", "fantasy", "science fiction"};
    private int booksReleased;

    public void setBooksReleased(int booksReleased){
        this.booksReleased = booksReleased;
    }

    public int getBooksReleased(){
        return this.booksReleased;
    }

    public void displayGenres(){
        System.out.println(Arrays.toString(genres));
    }





}
