package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower = new Flower(FlowerType.ROSE,Color.RED,5,10);
    private FlowerPack pack = new FlowerPack(flower, 10);

    @Test
    void price() {
        assertEquals(100,pack.getPrice());
    }
}