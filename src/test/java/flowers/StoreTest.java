package flowers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower1 = new Flower(FlowerType.ROSE,Color.RED,5,10);
    private Flower flower2 = new Flower(FlowerType.TULIP,Color.RED,9,5);

    private List<Flower> flowers1 = new ArrayList<>();


    Store testStore = new Store(flowers1, flowers1);
    Color paramOne = Color.BLUE;

    List<Flower> result = testStore.search(paramOne);

    @Test
    void searching() {
        assertEquals(0,result.size());
    }
}