package decorators;

import flowers.*;
import flowers.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerDecoratorTest {

    Flower flower = new Flower(FlowerType.ROSE, Color.RED,5,10);
    Item decoratedFlower = new FlowerDecorator(flower);

    @Test
    void getPrice() {
        assertEquals(14, decoratedFlower.getPrice());
    }
}