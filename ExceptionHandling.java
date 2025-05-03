import java.util.Scanner; // Import the Scanner class for user input
public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Enter the number of chocolates: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the number of students: ");
        int m = scanner.nextInt();
        scanner.close();
        try {
            int chocolatesPerStudent = n / m; // Calculate chocolates per student
            System.out.println("Chocolates per student: " + chocolatesPerStudent);
        } 
        catch (ArithmeticException e) { // Handle division by zero
            System.out.println("Number of students cannot be zero.");
        } 
    }
}