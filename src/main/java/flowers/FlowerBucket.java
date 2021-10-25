package flowers;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    @Setter
    private FlowerPack[] bucket;

    public FlowerBucket(FlowerPack[] packs) {
        this.bucket = packs;
    }

    double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: bucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
