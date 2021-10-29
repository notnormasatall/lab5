package decorators;

import flowers.Item;

public class FlowerDecorator extends ItemDecorator{
    public FlowerDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }

}
