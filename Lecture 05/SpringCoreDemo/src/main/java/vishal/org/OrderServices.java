package vishal.org;

public class OrderServices {
    public void placeOrder() {

        paymentService.pay();

        System.out.println("Order placed");
    }

}
