public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 8 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("finally");
        }
        System.out.println("Successful");
    }
}
