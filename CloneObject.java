class Box {
    double length, width, depth;

    Box(Box ob) {
        this.length = ob.length;
        this.width = ob.width;
        this.depth = ob.depth;
    }

    Box(double l, double w, double d) {
        this.length = l;
        this.width = w;
        this.depth = d;
    }

    double volume() {
        return length * width * depth;
    }
}

public class CloneObject {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box myclone = new Box(mybox1);
        double vol = myclone.volume();
        System.out.println("Volume of mybox1 is " + vol);
    }
}