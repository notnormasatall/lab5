package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    @Test
    void createConnection() {

        Connection instanceOne = Connection.getConnection();
        Connection instanceTwo = Connection.getConnection();

        assertSame(instanceOne, instanceTwo);
    }
}