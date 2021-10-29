package payment;

public class PayPalPaymentStrategy implements Payment{

    @Override
    public boolean pay(double price) {
        System.out.println("Payed " + price + "$" + " with PayPal");
        return true;
    }
}
