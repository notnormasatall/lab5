package flowers;

import lombok.Getter;

@Getter
public class FlowerPack {
    private int amount;
    private Flower flower;

    public FlowerPack(Flower fl, int a) {
        this.amount = a;
        this.flower = fl;
    }

    public double getPrice() {
        return flower.getPrice()*amount;
    }

    @Override
    public String toString() {
        return "FlowerPack{" +
                "amount=" + amount +
                ", flower=" + flower +
                '}';
    }
}
