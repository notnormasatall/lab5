package delivery;

import flowers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy dhl;
    List<Item> toDeliver;

    @BeforeEach
    void setUp(){
        dhl = new DHLDeliveryStrategy();
        toDeliver = new ArrayList<>();
        Flower f = new Flower(FlowerType.ROSE,Color.RED,5,10);
        toDeliver.add(f);
    }

    @Test
    void deliver() {
        assertTrue(dhl.deliver(toDeliver));
    }
}