
package pl.pankalla.weronika;

public class SurfaceArea {
    double pi = 3.14;

    // W metodzie statycznej nie mozna uzywac atrybutow ogolnych, zmiennych, ktore istnieja poza nią samą
    // (chyba, ze sa to atrybuty statyczne)
    // Po usunieciu z deklaracji metody okreslenia "static", mozna juz uzywac atrybutow, ktore sa poza nia



    public void calculateSurfaceCircle(double r){
        System.out.println((pi*(r*r)));
    }

    public void calculateSurfaceRectangle(double length, double width){
        System.out.println((length * width));
    }

    public void calculateSurfaceTriangle(double a, double h){
        System.out.println(((a * h)/2));
    }
}