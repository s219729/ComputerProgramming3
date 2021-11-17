// 10.	Using a class describing cinema tickets, write a program that creates two tickets. Print the created tickets.
//11.	Using the class to calculate the area of geometric figures, write a program that creates the calculation and displays:
//a.	area of a rectangle with sides 4 and 5
//b.	area of a circle with a radius of 3
//c.	area of a triangle with base 3 and height 4



package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        CinemaTicket cinemaTicket = new CinemaTicket();
        cinemaTicket.cinemaName = "Multikino";
        cinemaTicket.filmTitle = "Dekalog";
        cinemaTicket.row = 3;
        cinemaTicket.seat = 5;
        cinemaTicket.price = 10.5;
        cinemaTicket.displayInfo();

        CinemaTicket cinemaTicket2 = new CinemaTicket();
        cinemaTicket2.filmTitle = "Gra";
        cinemaTicket2.row = 6;
        cinemaTicket2.seat = 16;
        cinemaTicket2.price = 20.5;
        cinemaTicket2.displayInfo();


        SurfaceArea circleSurface = new SurfaceArea();
        circleSurface.calculateSurfaceCircle(3.0);

        SurfaceArea rectangleSurface = new SurfaceArea();
        rectangleSurface.calculateSurfaceRectangle(4.0, 5.0);

        SurfaceArea triangleSurface = new SurfaceArea();
        triangleSurface.calculateSurfaceTriangle(3.0, 4);
    }
}
