package user;

import delivery.DHLDeliveryStrategy;
import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiverOne;
    Receiver receiverTwo;

    @BeforeEach
    void setUp(){
        receiverOne = new Receiver();
        receiverTwo = new Receiver();
        receiverTwo.update("one");
    }

    @Test
    void idCheck() {
        assertEquals(1, receiverTwo.getId() - receiverOne.getId());
    }

    @Test
    void statusCheck() {
        assertEquals("one", receiverTwo.getStatus());
    }
}