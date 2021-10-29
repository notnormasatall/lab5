package decorators;

import flowers.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BucketDecoratorTest {

    private Flower flower1 = new Flower(FlowerType.ROSE, Color.RED,5,10);
    private FlowerPack pack1 = new FlowerPack(flower1,10);
    private Flower flower2 = new Flower(FlowerType.TULIP,Color.BLUE,7,7);
    private FlowerPack pack2 = new FlowerPack(flower2,10);
    private FlowerPack[] packs= {pack1,pack2};
    private FlowerBucket bucket = new FlowerBucket(packs);
    private Item bucketDecorator = new BucketDecorator(bucket);

    @Test
    void getPrice() {
        assertEquals(180,bucketDecorator.getPrice());
    }
}