package db;

public class Connection {
    private static Connection instance;

    private Connection() {
    }

    public static Connection getConnection() {
        if (instance == null) {
            instance = new Connection();
        }

        return instance;
    }
}
