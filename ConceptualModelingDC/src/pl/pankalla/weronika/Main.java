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

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("Weronika", "34143", 2010, 100.00, "1234");


        account1.displayBalance();
        account1.makeDeposit(100.00);
        account1.displayBalance();
        account1.makeWithdraw(50.00);
        account1.displayBalance();


//        account1.makeDeposit(500.00);
//        account1.displayBalance();
//        account1.makeDeposit(200.00);
//        account1.displayBalance();
//        account1.makeWithdraw(300.00);
//        account1.displayBalance();
//
//        account1.makeDeposit(1000.00);
//        account1.makeWithdraw(600.00);
//        account1.displayBalance();




    }
}
