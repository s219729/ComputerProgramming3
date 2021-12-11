public class Triangle extends Shape {
    private double a;
    private double h;
    private double c;

    public Triangle(double a, double h, double c) {
        this.a = a;
        this.h = h;
        this.c = c;
    }

    public double area(){
        return ((a*h)/2);
    }


    public double perimeter(){
        return (a+h+c);
    }
}
