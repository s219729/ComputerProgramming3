//12.	Modify the class describing cinema tickets.
// Add a constructor that creates a ticket for the specified movie, with row and seat numbers.
// Assume that in the first two rows the ticket price is PLN 10, and in the remaining rows, PLN 25.
// Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”,
// the first one is in row 2 and the second one in row 7. Print the created tickets.

package pl.pankalla.weronika;

public class CinemaTicket {
    String cinemaName;
    String filmTitle;
    double price;
    int row;
    int seat;

    //Creating default constructor
    public CinemaTicket(int row, int seat){
        this("Morning Star Cinema", "Gladiator", row , seat);
    }

    //Creating constructor with parameters
    public CinemaTicket(String cinemaName, String filmTitle, int row, int seat){
        this.cinemaName = cinemaName;
        this.filmTitle = filmTitle;
        this.price = price;
        this.row = row;
        this.seat = seat;
    }


    public void displayInfo(){
        if (row == 1 || row == 2 || row == 0) {
            this.price = 10;
        } else {
            this.price = 25;
        }
        System.out.println("Cinema Name: " + cinemaName + "\nFilm title: " +
                filmTitle + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: " + price + "\n");
    }
}