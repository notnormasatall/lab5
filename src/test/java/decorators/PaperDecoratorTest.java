package decorators;

import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    Flower flower = new Flower(FlowerType.ROSE, Color.RED,5,10);
    Item flowerPaperDecorator = new PaperDecorator( new FlowerDecorator(flower));

    @Test
    void getPrice() {
        assertEquals(19, flowerPaperDecorator.getPrice());
    }

}