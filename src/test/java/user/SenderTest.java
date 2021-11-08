package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender receiverOne;
    Sender receiverTwo;

    @BeforeEach
    void setUp(){
        receiverOne = new Sender();
        receiverTwo = new Sender();
        receiverTwo.update("one");
    }

    @Test
    void idCheck() {
        assertEquals(1, receiverTwo.getId() - receiverOne.getId());
    }

    @Test
    void statusCheck() {
        assertEquals("one", receiverTwo.getStatus());
    }
}