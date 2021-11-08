package order;

import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import payment.Payment;
import user.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    Flower flower;
    List<Item> items;
    List<User> users;
    User user;

    @BeforeEach
    void setUp(){
        order = new Order();
        flower = new Flower(FlowerType.ROSE, Color.RED,5,10);
        items = new ArrayList<>();
        order.setItems(items);
        order.setDeliveryMethod(new DHLDeliveryStrategy());
        order.setPaymentMethod(new PayPalPaymentStrategy());

        users = new ArrayList<>();
        users.add(user);
    }

    @Test
    void processOrder() {
        assertTrue(order.processOrder());
    }

    @Test
    void notifyUser() {
        assertTrue(order.notifyUsers());
    }
}