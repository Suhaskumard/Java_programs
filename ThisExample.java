// Demonstration of this key word
class Box {
    // Declare instance variables for length, width, and height of the box
    double length, width, height;

   
    Box(double length, double width, double height) {
       
        this.length = length; // 'this' refers to the current object's length
        this.width = width;   // 'this' refers to the current object's width
        this.height = height; // 'this' refers to the current object's height
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

//
public class ThisExample {
    
    public static void main(String args[]) {
       
        Box box1 = new Box(1, 2, 3);
   
        box1.displayDetails();
       
        System.out.println("Box 1 Volume = " + box1.calculateVolume());
    }
}