// 11.	The Product class describes food products using two attributes:
// the product name and whether the product is vegetarian.
// Define the class, its attributes, and getter and setter methods for all attributes.
// Then create a product, set attributes' values and display product information.
//12.	Choose any object. Then define a class that describes such objects.
// Hide data about an object using data encapsulation.



package pl.pankalla.weronika;

public class Product {
    private String name;
    private boolean isVegetarian;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setIsVegetarian(boolean isVegetarian){
        this.isVegetarian = isVegetarian;
    }

    public boolean getIsVegetarian(){
        return this.isVegetarian;
    }

    public String toString() {
        return "Product: " + getName() + "\nIs this product vegetarian: " + getIsVegetarian();
    }


}
