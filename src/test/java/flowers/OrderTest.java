package flowers;

import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order orderOne;
    List<Item> items;
    Flower flowerOne;
    FlowerPack packOne;
    FlowerBucket bucketOne;
    FlowerPack[] packs;
    DHLDeliveryStrategy dhl;
    CreditCardPaymentStrategy payment;

    @BeforeEach
    void setUp(){
        orderOne = new Order();
        items = new ArrayList<>();
        flowerOne = new Flower(FlowerType.ROSE,Color.RED,5,10);
        packOne = new FlowerPack(flowerOne,10);
        FlowerPack[] packs = {packOne};
        bucketOne = new FlowerBucket(packs);

        items.add(bucketOne);
        orderOne.setOrder(items);
        orderOne.setDelivery(dhl);
        orderOne.setPayment(payment);
    }

    @Test
    void addItem() {
        orderOne.addItem(new Flower(FlowerType.ROSE, Color.RED,5,10));
        assertEquals(orderOne.getOrder().toArray().length, 2);
    }

    @Test
    void deleteItem() {
        orderOne.removeItem(bucketOne);
        assertEquals(orderOne.getOrder().toArray().length, 0);
    }

    @Test
    void calculateTotal() {
        double totalPrice = orderOne.calculateTotal();
        assertEquals(totalPrice, 100);
    }
}