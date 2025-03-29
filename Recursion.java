class Factorial
 {
    int fact(int n)
     {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}

public class Recursion
 {
    public static void main(String args[]) 
    {
        Factorial f = new Factorial();
        System.out.println("Factorial of 5 is: " + f.fact(5));
        System.out.println("Factorial of 8 is: " + f.fact(8));
    }
}
