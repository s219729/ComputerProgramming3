// 17.	The sales system consists of three categories of objects: a seller, a customer and a purchased product.
// The seller can be a company while the customer is a person. Create class diagrams for each of the object categories.
// Then, based on the created class diagrams, define corresponding classes. Save all three diagrams in one file.
// Finally, define classes based on the created class diagrams and write a program that creates objects,
// assign them attribute values, and call the defined methods.



package pl.pankalla.weronika;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Seller firstSeller = new Seller("Ansell");
        Customer firstCustomer = new Customer("Weronika", 24);
        Product firstProduct = new Product();

        firstSeller.display();
        firstSeller.displaySellingProduct();
        firstSeller.displayFavCustomer();

        firstCustomer.display();

        firstProduct.display();


    }

}

