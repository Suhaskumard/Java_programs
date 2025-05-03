import com.mooduCommerce.customer.Customer;
import com.mooduCommerce.order.Order;


public class mooduCommerceMain {
    public static void main(String[] args) {
        
        Customer customer = new Customer("Muttappa Rai","muthappa@gmail.com");
        Order order = new Order("ORD123",500);

        System.out.println("--- Customer Details ---");
        customer.displayCustomerInfo();

        System.out.println("--- Order Details ---");  
        order.displayOrder();
    }
}
