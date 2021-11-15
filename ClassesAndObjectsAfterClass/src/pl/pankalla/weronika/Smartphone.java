package pl.pankalla.weronika;

public class Smartphone {
    String brand;
    String model;
    double price;
    int productionYear;
    boolean hasWarranty;
    boolean isWaterproof;

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Waterproof: " + isWaterproof);
    }

    public boolean checkWarranty(){
        if ((2021-productionYear) <= 2) {
            hasWarranty = true;
        } else {
            hasWarranty = false;
        }
        return hasWarranty;
    }

    public void calling(){
        System.out.println("Dryyyn dryyyn!");
    }

}

