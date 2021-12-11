public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area(){
        return (a*b);
    }

    public double perimeter(){
        return (a+a+b+b);
    }


}
