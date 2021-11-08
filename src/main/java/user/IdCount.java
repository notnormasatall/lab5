package user;

public class IdCount {
    static int id;

    public static int genId() {
        id += 1;
        return id;
    }
}
