// // 11.	The Product class describes food products using two attributes:
//// the product name and whether the product is vegetarian.
//// Define the class, its attributes, and getter and setter methods for all attributes.
//// Then create a product, set attributes' values and display product information.
////12.	Choose any object. Then define a class that describes such objects.
//// Hide data about an object using data encapsulation.

package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
	Product firstProduct = new Product();
	firstProduct.setName("Banana bread");
	firstProduct.setIsVegetarian(true);

	System.out.println(firstProduct);

    }
}
