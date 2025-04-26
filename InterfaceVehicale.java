interface Vehicle {
    void numberOfSeats();
    void numberOfWheels();
}

class Car implements Vehicle {
    public void numberOfSeats() {
        System.out.println("Car has 4 seats.");
    }

    public void numberOfWheels() {
        System.out.println("Car has 4 wheels.");
    }
}

class Bike implements Vehicle {
    public void numberOfSeats() {
        System.out.println("Bike has 2 seats.");
    }

    public void numberOfWheels() {
        System.out.println("Bike has 2 wheels.");
    }
}

public class InterfaceVehicale{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.numberOfSeats();
        car.numberOfWheels();

        bike.numberOfSeats();
        bike.numberOfWheels();
    }
}
