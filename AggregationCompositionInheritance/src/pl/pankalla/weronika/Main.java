package pl.pankalla.weronika;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Ford", "Mustang");
        myCar.display();
        myCar.carTest();

//        Vehicle myVehicle = new Vehicle("Audi");
//        myVehicle.display();

        Vehicle testCar = new Car("BMW", "5Y");
        testCar.display();

        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle v = new Vehicle("Test");
        Vehicle motorcycle = new Motorcycle("Test");
        vehicleList.add(myCar);
        vehicleList.add(testCar);
        vehicleList.add(motorcycle);
        vehicleList.add(v);

        for(Vehicle vehicle: vehicleList){
            vehicle.sound();
        }

        // myCar.hong();
        // System.out.println(myCar.brand + " " + myCar.getModelName());


        //aggregation
        Speed speed = new Speed(10);

        Car car = new Car("A", "B", speed);
        

        //composition
        Car secondCar = new Car("Z", "Y");


    }
}
