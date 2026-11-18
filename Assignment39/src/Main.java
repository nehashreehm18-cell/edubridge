
class Vehicle {
    String brand;

    // Parent class constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Parent class method
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand;

    // Child class constructor
    Car(String vehicleBrand, String carBrand) {
        super(vehicleBrand);
        this.brand = carBrand;
    }

    // Overriding display() method
    @Override
    void display() {
        super.display();
        System.out.println("Car Brand: " + this.brand);
        System.out.println("Parent Brand: " + super.brand);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car("Toyota", "BMW");

        c.display();
    }
}
