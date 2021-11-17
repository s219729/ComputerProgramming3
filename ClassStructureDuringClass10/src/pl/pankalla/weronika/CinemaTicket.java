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