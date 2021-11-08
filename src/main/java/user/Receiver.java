package user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Receiver implements User{
    private int id;
    private String status;

    public Receiver() {
        this.id = IdCount.genId();
    }


    @Override
    public void update(String stat) {
        this.status = stat;
    }
}
