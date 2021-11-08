package order;

import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import flowers.*;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class QuickOrderConstructor {

    public static Order createOrder() {
        Flower flowerOne = new Flower(FlowerType.ROSE, Color.RED,5,10);
        Flower flowerTwo = new Flower(FlowerType.TULIP, Color.BLUE,6,5);
        Flower flowerThree = new Flower(FlowerType.CHAMOMILE, Color.YELLOW,5,10);

        FlowerPack packOne = new FlowerPack(flowerOne,10);
        FlowerPack packTwo = new FlowerPack(flowerTwo,10);
        FlowerPack packThree = new FlowerPack(flowerThree,10);

        FlowerPack[] packs= {packOne,packTwo, packThree};
        FlowerBucket bucket = new FlowerBucket(packs);
        List<Item> itemsOrder = new ArrayList<>();

        itemsOrder.add(bucket);
        Delivery delStrategy = new DHLDeliveryStrategy();
        Payment payStrategy = new PayPalPaymentStrategy();

        return new Order(itemsOrder, delStrategy, payStrategy);
    }
}
