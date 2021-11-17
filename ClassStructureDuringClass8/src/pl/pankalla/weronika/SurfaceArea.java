package pl.pankalla.weronika;

public class SurfaceArea {
    double length;
    double width;
    double pi = 3.14;
    double r;
    double a;
    double h;

    // W metodzie statycznej nie mozna uzywac atrybutow ogolnych, zmiennych, ktore istnieja poza nią samą
    // (chyba, ze sa to atrybuty statyczne)



    public static void calculateSurfaceCircle(){
        System.out.println((pi*(r^2)));
    }

    public static void calculateSurfaceRectangle(){
        System.out.println((length * width));
    }

    public static void calculateSurfaceTriangle(){
        System.out.println(((a * h)/2));
    }
}
