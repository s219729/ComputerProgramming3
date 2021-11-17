// 7.	Define a class CinemaTicket to describe cinema tickets.
// The ticket attributes are: cinema name, film title, row, seat, and price.
// Since the name of cinema is the same for all tickets, use a static field.
// Then define a method to display ticket data. Try to create two tickets and display ticket details.

package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        CinemaTicket.cinemaName = "Multikino";

        CinemaTicket firstTicket = new CinemaTicket();
        firstTicket.filmTitle = "Kill Bill";
        firstTicket.row = 2;
        firstTicket.seat = 15;
        firstTicket.price = 30.0;

        CinemaTicket secondTicket = new CinemaTicket();
        secondTicket.filmTitle = "Matrix";
        secondTicket.row = 5;
        secondTicket.seat = 20;
        secondTicket.price = 25.5;

        firstTicket.displayInfo();
        secondTicket.displayInfo();




    }
}
