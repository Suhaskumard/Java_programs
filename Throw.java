import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ENTER THE AGE");
            int age = sc.nextInt();
            if (age < 0) {
                throw new ArithmeticException("AGE CAN'T BE NEGATIVE");
            }
            System.out.println("Your age is " + age); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage()); 
        }
    }
}
