//15.	Create a library of methods for the calculation of basic statistics:
//a.	Number of items within the specified range <x,y>
//b.	Sum of numbers in the given range  <x,y>
//c.	Arithmetic mean of the numbers in the given range  <x,y>
//Then create a program that calculates and displays the basic statistics for integers in the range <5,10>


package pl.pankalla.weronika;

public class Statistics {
    int downRange;
    int upRange;

    Statistics(int downRange, int upRange){
        this.downRange = downRange;
        this.upRange = upRange;
    }

    //Number of items within the specified range <x,y>
    public int numberOfItems(){
        int counter = 0;
        for(int i=downRange; i<=upRange && i>=downRange; i++){
            counter += 1;
        }
        return counter;
    }

    //Calculate sum of numbers in the given range  <x,y>
    public int calculateSum(){
        int sum = 0;
        for(int i=downRange; i<=upRange && i>=downRange; i++){
            sum += i;
        }
        return sum;
    }

    //Arithmetic mean of the numbers in the given range  <x,y>
    public double aritmeticMean(){
        double mean = (1.0 * calculateSum()) / numberOfItems();
        return mean;
    }
}
