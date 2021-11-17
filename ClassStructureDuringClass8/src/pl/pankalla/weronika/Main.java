// 8.	Define a class SurfaceArea that contains static methods to calculate the surface area for:
// circle, rectangle and triangle.
// Validate the created methods.


package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        SurfaceArea surfaceArea = new SurfaceArea();
        surfaceArea.length = 5.0;
        surfaceArea.width = 2.0;
        surfaceArea.r = 3.5;
        surfaceArea.a = 2.0;
        surfaceArea.h = 6.0;

        surfaceArea.calculateSurfaceCircle();
        surfaceArea.calculateSurfaceRectangle();
        surfaceArea.calculateSurfaceTriangle();

    }
}
