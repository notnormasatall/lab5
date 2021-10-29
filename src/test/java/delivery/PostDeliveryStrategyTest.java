package delivery;

import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    PostDeliveryStrategy dhl;
    List<Item> toDeliver;

    @BeforeEach
    void setUp(){
        dhl = new PostDeliveryStrategy();
        toDeliver = new ArrayList<>();
        Flower f = new Flower(FlowerType.ROSE, Color.RED,5,10);
        toDeliver.add(f);
    }

    @Test
    void deliver() {
        assertTrue(dhl.deliver(toDeliver));
    }
}