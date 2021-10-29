package flowers;

import decorators.PaperDecorator;
import delivery.DHLDeliveryStrategy;
import payment.CreditCardPaymentStrategy;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Store myStore = new Store(FlowerGenerator.generateFlowers(random.nextInt(100 - 1) + 1), FlowerGenerator.generateFlowers(random.nextInt(100 - 1) + 1));

        Color paramOne = Color.RED;
        FlowerType paramTwo = FlowerType.ROSE;

        myStore.search(paramOne);
        myStore.search(paramTwo);
        myStore.reset();

        Flower fl1 = new Flower(FlowerType.ROSE,Color.RED,5,10);
        PaperDecorator fl1Paper = new PaperDecorator(fl1);

        double price = fl1Paper.getPrice();
        ArrayList<Item> order = new ArrayList<>();
        order.add(fl1Paper);

        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();

        System.out.println(payment.pay(price));
        System.out.println(delivery.deliver(order));
    }
}
