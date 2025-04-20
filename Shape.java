abstract  class Shape {
    abstract void draw();
    void display(){
        System.out.println("this is a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
    System.out.println("Drawing a circle");
}
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a rectangle");

    }

}
class AbstractClassDemo
{
    public static void main(String args[])
    {
        Rectangle R1 = new Rectangle();
        R1.draw();

        Circle C1= new Circle();
        C1.draw();
    }
}
