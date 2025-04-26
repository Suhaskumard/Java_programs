interface Area{
    void findArea(); // Abstract method to find area
}
class Rectangle implements Area{
    int length, width;
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    public void findArea(){
        System.out.println("Area of Rectangle: " + (length * width));
    }
}
class Triangle implements Area{
    int base, height;
    Triangle(int b, int h){
        base = b;
        height = h;
    }
    public void findArea(){
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}
public class InterfaceArea{
    public static void main(String[] args){
        Area rect = new Rectangle(5, 10);
        rect.findArea(); // Outputs: Area of Rectangle: 50
        
        Area tri = new Triangle(5, 10);
        tri.findArea(); // Outputs: Area of Triangle: 25.0
    }
}