package pl.pankalla.weronika;

//16.Define a class for describing rectangles.
// Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively.
// Display their dimensions, perimeters and surface areas.

public class Rectangle {
    double length;
    double width;

    public void displayDimensions(){
        System.out.println("The length of rectangle:  " + length + " , the width of rectangle: " + width);
    }
    public void displaySurface(){
        System.out.println("The surface of rectangle: " + (length * width));
    }
    public void displayPerimeter(){
        System.out.println("The perimeter of rectangle: " + ((length*2) + (width*2)));
    }



}
