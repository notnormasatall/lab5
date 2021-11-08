package order;

import delivery.Delivery;
import flowers.Item;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;
import user.User;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<User> users = new ArrayList<>();
    @Setter @Getter
    private List<Item> items = new ArrayList<>();
    @Setter @Getter
    private Delivery deliveryMethod;
    @Setter @Getter
    private Payment paymentMethod;

    public Order(){}

    public Order(List<Item> order, Delivery delivery, Payment payment) {
        this.items = order;
        this.deliveryMethod = delivery;
        this.paymentMethod = payment;
    }

    public Order createOrder(List<Item> order, Delivery delivery, Payment payment) {

        Order initialOrder = new Order(order, delivery, payment);
        initialOrder.checkPrice();

        return initialOrder;
    }

    public void deleteItem(Item item) {
        this.items.remove(item);
    }

    public double checkPrice() {
        double price = 0;

        for (Item item: items) {
            price += item.getPrice();
        }
        return price;
    }

    public boolean processOrder() {
        if (deliveryMethod != null && paymentMethod != null) {

            boolean checkDel = deliveryMethod.deliver(items);
            boolean checkPay = paymentMethod.pay(checkPrice());

            if (checkDel && checkPay) {
                System.out.println("Order successful!");
                return true;
            }
        }

        System.out.println("Order unsuccessful!");
        return false;
    }

    @Setter @Getter
    private String currentStatus = "initial status";

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public boolean notifyUsers() {
        for (User user: users) {
            user.update(this.currentStatus);
        }
        return true;
    }

    public void order() {
        notifyUsers();
    }
}
