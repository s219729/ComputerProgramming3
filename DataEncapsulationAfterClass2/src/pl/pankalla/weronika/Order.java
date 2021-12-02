package pl.pankalla.weronika;

import java.util.Scanner;

public class Order {
    private String customerName;
    private String customerSurname;
    private int customerAge;
    private double amountToPay;
    private int numberOfOrderedBooks;
    private boolean isPersonalPickup;
    private boolean isInpost;
    private String customerPhone;
    private String customerAddress;


    public Order(String customerName, String customerSurname, int customerAge, double amountToPay,
                 int numberOfOrderedBooks, boolean isPersonalPickup, boolean isInpost,
                 String customerPhone, String customerAddress)   {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAge = customerAge;
        this.amountToPay = amountToPay;
        this.numberOfOrderedBooks = numberOfOrderedBooks;
        this.isPersonalPickup = isPersonalPickup;
        this.isInpost = isInpost;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }

    public Order(){

    }


    public void setCustomerName(String customerName){
        this.customerName = customerName.substring(0,1).toUpperCase() + customerName.substring(1).toLowerCase();
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerSurname(String customerSurname){
        this.customerSurname = customerSurname.substring(0,1).toUpperCase() + customerSurname.substring(1).toLowerCase();
    }

    public String getCustomerSurname(){
        return this.customerSurname;
    }

    public void setCustomerAge(int customerAge){
        this.customerAge = customerAge;
        if(customerAge < 18){
            System.out.println("Age under 18. Approval from parent is needed");
        }
    }

    public int getCustomerAge(){
        return this.customerAge;
    }

    public void setAmountToPay(double amountToPay){
        if (amountToPay <= 0){
            System.out.println("Calculate the amount again");
            Scanner in = new Scanner(System.in);
            double userInput = in.nextDouble();
            System.out.println("New amount is: " + userInput);
            this.amountToPay = userInput;
        } else{
            this.amountToPay = amountToPay;
        }
    }

    public double getAmountToPay(){
        return this.amountToPay;
    }

    public void setNumberOfOrderedBooks(int numberOfOrderedBooks){
        this.numberOfOrderedBooks = numberOfOrderedBooks;
    }

    public int getNumberOfOrderedBooks(){
        return this.numberOfOrderedBooks;
    }

    public void setIsPersonalPickup(boolean isPersonalPickup){
        this.isPersonalPickup = isPersonalPickup;
    }

    public boolean getIsPersonalPickup(){
        return this.isPersonalPickup;
    }

    public void setIsInpost(boolean isInpost){
        this.isInpost = isInpost;
    }

    public boolean getIsInpost(){
        return this.isInpost;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone(){
        return this.customerPhone;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress(){
        return this.customerAddress;
    }

    public void displayOnlyCustomerInfo(){
        System.out.println("Customer name: " + getCustomerName() + "\nCustomer surname: " + getCustomerSurname());
        System.out.println("Customer age: " + getCustomerAge());
        System.out.println("Customer address: " + getCustomerAddress() + "\nCustomer phone: " + getCustomerPhone());
    }

    public String toString(){
        return "Customer name: " + getCustomerName() + " , customer surname: " + getCustomerSurname() + " , customer age: "
                + getCustomerAge() + " , amount to pay: " + getAmountToPay() + " , number of ordered books: " +
                getNumberOfOrderedBooks() + " , personal pickup: " + getIsPersonalPickup() +
                " , customer phone: " + getCustomerPhone() + " , customer address: " + getCustomerAddress();
    }

}
