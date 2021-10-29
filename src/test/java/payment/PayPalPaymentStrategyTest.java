package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    PayPalPaymentStrategy payment = new PayPalPaymentStrategy();

    @Test
    void pay() {
        assertTrue(payment.pay(2.4));
    }
}