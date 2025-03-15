class Box {
    double length, width, height;

    Box(double l, double w) {
        length = l;
        width = w;
        height = 10; 
    }

    Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double calculateVolume() {
        return length * width * height;
    }

    double calculateSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    void displayDetails() {
        System.out.println("Box Dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}

public class ConstructorOverload {
    public static void main(String args[]) {
        Box box5;

        Box box1 = new Box(1, 2, 3);

          box5=box1;

        Box box2 = new Box(3, 4, 6);
        Box box3 = new Box();
        Box box4 = new Box(2, 3); 

        box1.displayDetails();
        box2.displayDetails();
        box3.displayDetails();
        box4.displayDetails();
        box5.displayDetails();

        System.out.println("Box 1 Volume = " + box1.calculateVolume());
        System.out.println("Box 2 Volume = " + box2.calculateVolume());
        System.out.println("Box 3 Volume = " + box3.calculateVolume());
        System.out.println("Box 4 Volume = " + box4.calculateVolume());
    }
}