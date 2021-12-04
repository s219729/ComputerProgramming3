// 5.	Working in a group, create Computer and Processor classes in a class diagram.
// Define class attributes and methods. Create a relationship between the classes assuming that objects of those
// classes cannot exist independently. If the first object is deleted, the second one have to be also deleted.
// What kind of relationship should be used? Mark the multiplicity in the class diagram.
// Save the class diagram to a graphic file.
//6.	Based on the created class diagram, define the classes in the programming language.
// Put the classes in a separate project. Then write a program that creates objects, assigns them attribute values,
// and calls the available methods.


public class Processor {
    private String brand;
    private double frequencyInGHZ;
    private int cores;

    public Processor(String brand, double frequencyInGHZ, int cores){
        this.brand = brand;
        this.frequencyInGHZ = frequencyInGHZ;
        this.cores = cores;
    }


    public String getBrand() {
        return brand;
    }

    public double getFrequencyInGHZ() {
        return frequencyInGHZ;
    }

    public int getCores() {
        return cores;
    }


    public void displayInfo(){
        System.out.println(this.brand);
        System.out.println(this.frequencyInGHZ);
        System.out.println(this.cores);
    }
}
