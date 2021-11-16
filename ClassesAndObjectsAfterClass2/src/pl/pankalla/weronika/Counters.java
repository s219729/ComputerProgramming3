package pl.pankalla.weronika;

//17.Design a simple counter. The initial value of the counter is 0.
// The counter can be increased or decreased by one, and increased and decreased by 10.
// It is possible to reset the counter to its initial value. Then define a class for counters.
// Create two counters. Set the first counter to 23 and the second one to -47.

public class Counters {
    int initialValue = 0;
    int counter = initialValue;

    public void increaseByOne(){
        counter+=1;
    }

    public void increaseByTen(){
        counter+=10;
    }

    public void decreaseByOne(){
        counter-=1;
    }

    public void decreaseByTen(){
        counter-=10;
    }

    public void resetToInitialValue(){
        counter = initialValue;
        System.out.println("You made a reset to initial value");
    }

    public void displayValue(){
        System.out.println("The value of counter for now is: " + counter);
    }

}