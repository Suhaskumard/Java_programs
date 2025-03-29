class Person 
{
    int height;
    Person(int h)
    {
        height = h;
    
    }
    Person add10( Person p)
    {
        Person temp = new Person(height+10);
        return temp;
    }
}
public class ReturningObjects {
    public static void main(String args[])
    {
Person P1 = new Person(150);
Person P2;
P2= P1.add10(P1);
System.out.println("Height of first person:" +P1.height);
System.out.println("Height of second person:" +P2.height);
    }
    
}
