// 14.	Define a class for describing books. Then, define fields and methods in the class that represent the attributes and behaviors of the book objects. Finally, create two books, assign them attribute values, and call defined methods.
//15.	Define a class for describing lamps. Then define the following object attributes and behaviors:
//a.	attributes: whether a lamp is on
//b.	behaviors: (1) switch on the lamp, (2) switch off the lamp, (3) display information whether the lamp is on or off
//After that, create two lamps, switch on the first one and switch off the second one. Display information whether the lamps are on or off.
//16.	Define a class for describing rectangles. Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively. Display their dimensions, perimeters and surface areas.
//17.	Design a simple counter. The initial value of the counter is 0. The counter can be increased or decreased by one, and increased and decreased by 10. It is possible to reset the counter to its initial value. Then define a class for counters. Create two counters. Set the first counter to 23 and the second one to -47.


package pl.pankalla.weronika;

import org.w3c.dom.css.Counter;

public class Main {

    public static void main(String[] args) {
        //Creating objects books
        Book firstBook = new Book();
        firstBook.title = "Pszczelarz z Aleppo";
        firstBook.author = "Christy Lefteri";
        firstBook.year = 2020;
        firstBook.pages = 356;
        firstBook.isAvailable = false;

        Book secondBook = new Book();
        secondBook.title = "Kamien na szczycie";
        secondBook.author = "Ewa Bialolecka";
        secondBook.year = 2002;
        secondBook.pages = 300;
        secondBook.isAvailable = true;

        //Displaying info about first book and changing availability in bookstore
        firstBook.displayInfo();
        firstBook.changeAvailability();

        //Displaying info about second book and changing availability in bookstore
        secondBook.displayInfo();
        secondBook.changeAvailability();

        //Creating object lamp
        Lamp lamp = new Lamp();
        lamp.model = "A765";
        lamp.isOn = false;

        //switch on the lamp
        lamp.switchOn();
        //display information whether the lamp is on or off
        lamp.onOrOff();

        //Creating second object lamp2
        Lamp lamp2 = new Lamp();
        lamp2.model = "R66";
        lamp2.isOn = true;

        //switch off the lamp
        lamp2.switchOff();
        //display information whether the lamp is on or off
        lamp2.onOrOff();


        //Creating two rectangle objects
        Rectangle rectangle = new Rectangle();
        rectangle.width = 4.0;
        rectangle.length = 2.5;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 3.0;
        rectangle2.length = 3.0;

        rectangle.displayDimensions();
        rectangle.displaySurface();
        rectangle.displayPerimeter();

        rectangle2.displayDimensions();
        rectangle2.displaySurface();
        rectangle2.displayPerimeter();


        // Creating first counter
        Counters counter = new Counters();
        counter.increaseByTen();
        counter.increaseByTen();
        for(int i=0; i<3; i++) {
            counter.increaseByOne();
        }
        counter.displayValue();
        counter.resetToInitialValue();
        counter.displayValue();

        // Creating second counter
        Counters counter2 = new Counters();
        for(int i=0; i<5; i++) {
            counter2.decreaseByTen();
        }
        for(int i=0; i<3; i++){
            counter2.increaseByOne();
        }
        counter2.displayValue();
        counter2.resetToInitialValue();
        counter2.displayValue();
    }
}
