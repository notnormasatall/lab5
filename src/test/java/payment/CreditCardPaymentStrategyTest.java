package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertTrue(payment.pay(2.8));
    }
}