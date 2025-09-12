// Superclass
class Vehicle {
    String type = "Vehicle";

    void displayType() {
        System.out.println("This is a " + type + ".");
    }
}

// Subclass
class Car extends Vehicle {
    String model = "Sedan";

    void displayModel() {
        System.out.println("This car is a " + model + " model.");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();  // Create object of subclass

        myCar.displayType();   // Call method from superclass
        myCar.displayModel();  // Call method from subclass
    }
}
