class A{
    int i,j;
    A(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j are :"+i+" and "+j);
    }
}

class B extends A{
    int k;
        B(int a,int b,int c){
            super(a, b);
            k=c;
        }
        void show(String msg){
            System.out.println(msg + k);
        }
}

public class overridding{
    public static void main(String[] args) {
        B B1= new B(1,2,3);
        B1.show("This is k: ");
        B1.show();
    }
}
  
