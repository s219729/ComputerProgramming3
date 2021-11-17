//12.	Modify the class describing cinema tickets.
// Add a constructor that creates a ticket for the specified movie, with row and seat numbers.
// Assume that in the first two rows the ticket price is PLN 10, and in the remaining rows, PLN 25.
// Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”,
// the first one is in row 2 and the second one in row 7. Print the created tickets.


package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        CinemaTicket firstTicket = new CinemaTicket("Morning Star Cinema", "Gladiator", 2, 10);
        CinemaTicket secondTicket = new CinemaTicket("Morning Star Cinema", "Gladiator", 7, 15);
        CinemaTicket testTicket = new CinemaTicket(7,12);

        firstTicket.displayInfo();
        secondTicket.displayInfo();
        testTicket.displayInfo();

    }
}
