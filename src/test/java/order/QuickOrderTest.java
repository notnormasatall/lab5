package order;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    @Test
    void createOrder() {
        Order order = QuickOrderConstructor.createOrder();
        assertEquals(250, order.checkPrice());
    }
}