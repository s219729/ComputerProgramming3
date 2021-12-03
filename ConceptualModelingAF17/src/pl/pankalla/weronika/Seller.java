package pl.pankalla.weronika;

public class Seller {
    private String name;

    Seller(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(this.name);
    }

    public void displaySellingProduct(){
        Product testProduct = new Product();
        testProduct.setName("Gloves");
        testProduct.setAmountInWarehouse(10);
        testProduct.setPrice(25.50);
        testProduct.display();
    }

    public void displayFavCustomer(){
        Customer testCustomer = new Customer("Tomek", 25);
        System.out.println("Name of favourite customer of this seller: " + testCustomer.getName());
        System.out.println("Age of favourite customer of this seller: " + testCustomer.getAge());
    }

}
