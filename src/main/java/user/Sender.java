package user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Sender implements User{
    private int id;
    private String status;

    public Sender() {
        this.id = IdCount.genId();
    }

    @Override
    public void update(String stat) {
        this.status = stat;
    }
}
