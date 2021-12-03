package pl.pankalla.weronika;

public class Car extends Vehicle {
    private String modelName;
    private Speed carSpeed;


    // with composition
    public Car(String brand, String modelName) {
        super(brand);
        this.modelName = modelName;
        this.carSpeed = new Speed();
    }

    // with aggregation
    public Car(String brand, String modelName, Speed speed) {
        super(brand);
        this.modelName = modelName;
        this.carSpeed = speed;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public int testOfSpeed(){
        return carSpeed.speedAtTheMoment;
    }

    public void display(){
        System.out.println("Car brand: " + super.brand + " , car name: " + this.modelName + ", speed: " + testOfSpeed());
    }

    public void carTest(){
        System.out.println("Hello from the Car");
    }

    public void sound() {
        System.out.println("Car");
    }
}
