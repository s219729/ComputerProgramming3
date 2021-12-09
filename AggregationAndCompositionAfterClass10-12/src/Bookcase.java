import java.util.ArrayList;

public class Bookcase {
    ArrayList<Book> listOfBooks = new ArrayList<Book>();


    public void addBook(Book book){
        listOfBooks.add(0, book);
    }

    public void removeBook(Book book){
        listOfBooks.remove(book);
    }

    public void displayTitles(){
        for(int i = 0; i < listOfBooks.size(); i++) {
            if (i == 0) {
                System.out.println("The first book in the bookcase is: " + listOfBooks.get(i).getTitle());
            } else if(i==1) {
                System.out.println("The second book in the bookcase is: " + listOfBooks.get(i).getTitle());
            } else if(i==2) {
                System.out.println("The third book in the bookcase is: " + listOfBooks.get(i).getTitle());
            } else {
                System.out.println("The " + (i+1) + "th book in the bookcase is: " + listOfBooks.get(i).getTitle());
            }
        }
    }

    public void displayTitlesAndAuthors(){
        for(int i = 0; i < listOfBooks.size(); i++) {
            if (i == 0) {
                System.out.println("The first book in the bookcase is: " + listOfBooks.get(i).getTitle() + ", " + listOfBooks.get(i).getAuthorNameSurname());
            } else if(i==1) {
                System.out.println("The second book in the bookcase is: " + listOfBooks.get(i).getTitle() + ", " + listOfBooks.get(i).getAuthorNameSurname());
            } else if(i==2) {
                System.out.println("The third book in the bookcase is: " + listOfBooks.get(i).getTitle() + ", " + listOfBooks.get(i).getAuthorNameSurname());
            } else {
                System.out.println("The " + (i+1) + "th book in the bookcase is: " + listOfBooks.get(i).getTitle() + ", " + listOfBooks.get(i).getAuthorNameSurname());
            }
        }
    }




}
