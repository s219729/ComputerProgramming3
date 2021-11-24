// 9.	Write a program that performs the following actions for the bank account:
//a.	Deposit PLN 500
//b.	Display balance
//c.	Deposit PLN 200
//d.	Display balance
//e.	Withdraw PLN 300
//f.	Display balance
//10.	If your account balance is less than the withdrawal amount, no withdrawal is possible.
// Include this condition in the program. When you try to withdraw, display a message.
//11.	In line with the bank's policy, you can withdraw no more than PLN 500 from your account at one time.
// Include these limitation in your program. Display a message when trying to withdraw a larger amount.



package pl.pankalla.weronika;

public class Account {
    private String ownerName;
    private String accountNumber;
    private int year;
    private double balance;
    private String password;


    Account(String ownerName, String accountNumber, int year, double balance, String password){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.year = year;
        this.balance = balance;
        this.password = password;
    }
    //+ setOwnerName(string)
    //+ getOwnerName()
    //+ setAccountNumber(string)
    //+ getAccountNumber()
    //+ setYear(int)
    //+ getYear()
    //+ setBalance(float)
    //+ getBalance()
    //+ setPassword(string)
    //+ getPassword()
    //+ displayBalance()
    //+ makeDeposit(float)
    //+ makeWithdraw(float)

     public void setOwnerName(String ownerName){
         this.ownerName = ownerName;
     }

     public String getOwnerName(){
         return this.ownerName;
     }

     public void setAccountNumber(String accountNumber){
         this.accountNumber = accountNumber;
     }

     public String getAccountNumber(){
         return this.accountNumber;
     }

     public void setYear(int year){
         this.year = year;
     }

     public int getYear(){
         return this.year;
     }

     public void setBalance(double balance){
         this.balance = balance;
     }

     public double getBalance(){
         return this.balance;
     }

     public void setPassword(String password){
         this.password = password;
     }

     public String getPassword(){
         return this.password;
     }

     public void displayBalance(){
         System.out.println("Account balance: " + this.balance);
     }

     public void makeDeposit(double deposit){
         balance = this.balance + deposit;
         System.out.println("You have added a deposit of: " + deposit + " PLN");
         System.out.println("Your balance is now: " + this.balance);
     }

    public void makeWithdraw(double withdraw){
        if (this.balance < withdraw) {
            System.out.println("You do not have enough money on your account to make withdrawal");
        } else if (withdraw > 500) {
            System.out.println("You can withdraw no more than PLN 500 from your account at one time!");
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("You have made a withdraw of: " + withdraw + " PLN");
            System.out.println("Your balance is now: " + this.balance);
        }
    }


}
