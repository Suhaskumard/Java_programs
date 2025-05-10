
class MyException extends Exception {
    int detail;

    
    MyException(int a) {
        detail = a;
    }

    
    public String toString() {
        return "MyException [detail=" + detail + "]";
    }
}


public class Ownexception {
    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal execution");
    }

    public static void main(String[] args) {
        try {
            compute(1);   
            compute(20);  
        } catch (MyException e) {
            System.out.println("Caught: " + e);
        }
    }
}
