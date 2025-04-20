class Human {
    String name;
    int age;
    Human()
    {
  name="";
  age=0;
  System.out.println("\nI am just born.");

    }

    Human(String n, int a){
        name = n;
        age = a;



    }
    void speak(){
        System.out.println("\n my name is" + name + ". I am a human.i am" + age + " years old.");

    }
}
class student extends Human{
    String studentID;
    String standard;
     student(String n,int a,String sID,String std){
      super(n,a);
      studentID = sID;
      standard = std;

     }
     void speak(){
        super.speak();
        System.out.println("I am studying in standard"+ standard +".My student is is " + studentID+'\n');

     }
}

class PG_student extends student{
    String specialization;
    PG_student(String name,int age,String studentID,String standard,String specialization){
        super(name,age,studentID,standard);
        this.specialization=specialization;

    }
    void research(){
        System.out.println("i am a post graduate student speciliazation in "+ specialization+".");
    }
}
public class InheritenceExample{
    public static void main(String[] args){
        Human h= new Human("manav" , 20);
        student s= new student("vijay" ,  17, "s12345" ," 12th ");
        PG_student p= new PG_student(" vijay ",23,"s12345","engeneering","cse");
        h.speak();
        s.speak();
        p.speak();

    }
}
