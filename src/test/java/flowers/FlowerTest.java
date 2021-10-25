package flowers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower = new Flower(FlowerType.ROSE,Color.RED,5,10);

    @Test
    void getSepalLength() {
        assertEquals(5,flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertEquals(Color.RED,flower.getColor());
    }

    @Test
    void getPrice() {
        assertEquals(10,flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE,flower.getType());
    }
}