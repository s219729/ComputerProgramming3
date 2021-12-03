package pl.pankalla.weronika;

public class Product {

    private String name;
    private double price;
    private int amountInWarehouse;

    Product(String name){
        this.name = name;
    }

    Product(){
        this.name = "Default best product";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setAmountInWarehouse(int amountInWarehouse){
        this.amountInWarehouse = amountInWarehouse;
    }

    public int getAmountInWarehouse(){
        return this.amountInWarehouse;
    }

    public void display(){
        System.out.println("Name of the product: " + this.name);
        System.out.println("Price of the product: " + this.price);
        System.out.println("Amount in warehouse: " + this.amountInWarehouse);
    }

}
