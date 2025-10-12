class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
        myCar.stop();
    }
}
