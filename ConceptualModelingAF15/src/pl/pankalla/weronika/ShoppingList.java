// 15.	Create a class diagram for a shopping list.
// You can use, for example, an ArrayList as the data structure for storing products.
// Then, based on the class diagram, define the class.
// Finally, create an object representing a shopping list and perform the following actions:
//a.	Display the list of products (should be empty)
//b.	Display information about the number of products to be purchased
//c.	Add three products to your shopping list
//d.	Display the list of products
//e.	Display information about the number of products to be purchased
//f.	Add one product to your shopping list
//g.	Display the list of products
//h.	Display information about the number of products to be purchased


// 16.	Add to the list of products the ability to enter product names from the keyboard.


package pl.pankalla.weronika;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> products;
    public ShoppingList() {
        this.products = new ArrayList<String>();
    }

    public void displayProducts(){
        System.out.println("Your list of products to buy: " + this.products.toString());
    }

    public void displayNumberOfProducts(){
        System.out.println("Number of products: " + this.products.size());

    }

    public void addProduct(String newProduct){
        this.products.add(newProduct);
    }

    public void productFromKeyboardInput(){
        boolean ifUserWant = true;
        while(ifUserWant == true){
            Scanner question = new Scanner(System.in);
            System.out.println("Do you want to add new product? Please answer: yes/no \n");
            String answer = question.nextLine();
            if(answer.equals("no")) {
                ifUserWant = false;
            } else {
                Scanner in = new Scanner(System.in);
                System.out.println("Type the product you want to buy: ");
                String productFromInput = in.nextLine();
                System.out.println("You have added " + productFromInput + " to the shopping list");
                this.products.add(productFromInput);
                displayProducts();
                displayNumberOfProducts();
            }
            }
        }

    }






