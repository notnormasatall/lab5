package decorators;

import flowers.Item;

public class BucketDecorator extends ItemDecorator{
    public BucketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 10 + super.getPrice();
    }
}
