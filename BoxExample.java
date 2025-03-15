class Box {
    double length, width, height;

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

public class BoxExample {
    public static void main(String args[]) {
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(3, 4, 6);

        box1.displayDetails();
        box2.displayDetails();

        System.out.println("Box 1 Volume = " + box1.calculateVolume());
        System.out.println("Box 2 Volume = " + box2.calculateVolume());
    }
}