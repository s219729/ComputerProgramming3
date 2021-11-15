// 13.	Specify at least five attributes and three behaviors for the objects:
//a.	Smartphone
//b.	Bank account


package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.brand = "Samsung";
        smartphone.model = "M31";
        smartphone.price = 530.0;
        smartphone.productionYear = 2019;
        smartphone.isWaterproof = false;

        smartphone.displayInfo();
        System.out.println("Has a warranty: " + smartphone.checkWarranty());
        smartphone.calling();

        Account weronikaAccount = new Account();
        weronikaAccount.number = "123452323";
        weronikaAccount.customerName = "Weronika Pankalla";
        weronikaAccount.balance = 2500.0;

        weronikaAccount.displayAccountInfo();
        weronikaAccount.makeDeposit(500.0);
        weronikaAccount.withdrawFunds(100.5);

        }

    }

