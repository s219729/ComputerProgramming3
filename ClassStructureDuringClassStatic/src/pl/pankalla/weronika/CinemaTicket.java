// 7.	Define a class CinemaTicket to describe cinema tickets.
// The ticket attributes are: cinema name, film title, row, seat, and price.
// Since the name of cinema is the same for all tickets, use a static field.
// Then define a method to display ticket data. Try to create two tickets and display ticket details.

package pl.pankalla.weronika;

public class CinemaTicket {
    static String cinemaName;
    String filmTitle;
    int row;
    int seat;
    double price;

    public void displayInfo(){
        System.out.println("Cinema Name: " + cinemaName + "\nFilm title: " +
                filmTitle + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: " + price);

    }
}
