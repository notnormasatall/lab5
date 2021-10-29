package decorators;

import flowers.Item;

public abstract class ItemDecorator extends Item {
    private final Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
