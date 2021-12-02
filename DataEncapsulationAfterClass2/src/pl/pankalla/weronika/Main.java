package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {

        Order firstOrder = new Order("Tomek", "Bochenek", 25,
                150.50, 6, false, true,
                "512345678", "Ulanow 38a");
        firstOrder.displayOnlyCustomerInfo();
        System.out.println(firstOrder);

        Order secondOrder = new Order();
        secondOrder.setCustomerName("weronika");
        secondOrder.setCustomerSurname("PaNKALLA");

        secondOrder.setCustomerAge(16);
        secondOrder.displayOnlyCustomerInfo();
        System.out.println(secondOrder);




    }
}
