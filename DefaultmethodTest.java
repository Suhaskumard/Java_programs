interface Vehicle {
    void start();
    
    default void honk() {
        System.out.println("Honking the horn!");
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting!");
    }
}
public class DefaultmethodTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); 
        car.honk();  
    }
}
