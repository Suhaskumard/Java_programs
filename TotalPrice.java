import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter unit price: ");
        double price = sc.nextDouble();
        double total = qty * price;
        System.out.println("Total Price before discount: " + total);
        System.out.print("Enter discount percentage : ");
        double discountPercentage = sc.nextDouble();
        double discountAmount = (discountPercentage / 100) * total;
        double finalPrice = total - discountAmount;
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Total Price after discount: " + finalPrice);
        sc.close();
    }
}