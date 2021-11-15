package pl.pankalla.weronika;

public class Account {
    String number;
    String customerName;
    double balance;

    public void makeDeposit(double deposit){
        balance += deposit;
        System.out.println("You made a deposit of: " + deposit);
        System.out.println("Now your account balance is: " + balance);
    }

    public void withdrawFunds(double withdraw){
        if (balance - withdraw >= 0) {
            balance -= withdraw;
            System.out.println("You withdrew " + withdraw);
            System.out.println("Now your balance is: " + balance);
        } else {
            System.out.println("You don't have enough money to withdraw funds!");
        }
    }

    public void displayAccountInfo(){
        System.out.println("Your account number is: " + number);
        System.out.println("Customer name is: " + customerName);
        System.out.println("Your balance is " + balance);
    }
}
