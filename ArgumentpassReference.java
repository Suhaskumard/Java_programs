class Person 
{
    int height;
    void add10(Person o)
    {
        o.height+=10;
    }
}
public class ArgumentpassReference {
    public static void main( String agrs[])
    {
        Person ob = new Person();
        ob.height=150;
        System.out.println("Height before call:" +ob.height);
        ob.add10(ob);
        System.out.println("Height after call:" +ob.height);
    }
    
}
