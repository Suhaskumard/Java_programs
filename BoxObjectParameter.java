

class box {
    double length, width, height;

    box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
boolean equals(box o)
{
    if(o.length == this.length && o.width == this.width && o.height == this.height)
    return true;
    else
    return false;
}
}
    public class BoxObjectParameter {
    public static void main(String args[])
    {
        box box1=new box(1,2,3);
        box box2=new box(3,4,5);
        box box3=new box(1,2,3);

        if(box3.equals(box1))
            System.out.println("box3 and box1 are same");
        else
            System.out.println("box 3 and box 1 are different");
        if(box2.equals(box1))
        
            System.out.println("box 2 and box 1 are same");
        else
            System.out.println("box 2 and box 1 are different");

        
    }
    
}

