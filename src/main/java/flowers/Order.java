package flowers;

import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Order {
    List<Item> order = new ArrayList<>();
    private Delivery delivery;
    private Payment payment;

    public Order() {
    }

    public double calculateTotal() {
        double total = 0;

        for (Item item: order) {
            total += item.getPrice();
        }
        return total;
    }

    public void addItem(Item item) {
        order.add(item);
    }

    public void removeItem(Item item) {
        if (order.contains(item)){
            order.remove(item);
            System.out.println("Item successfully deleted!");
        }
        else {
            System.out.println("No such item in order!");
        }
    }

    public boolean processOrder() {
        double price = calculateTotal();

        if (payment.pay(price)) {
            return delivery.deliver(order);
        } else {
            return false;
        }
    }
}

