package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor
public class Flower {
    protected double sepalLength;
    protected double price;
    protected Color color;
    protected FlowerType type;

    public Flower(FlowerType flowerType, Color color, double s, double p) {
        this.sepalLength = s;
        this.price = p;
        this.color = color;
        this.type = flowerType;
    }

    public Flower() {

    }

    @Override
    public String toString() {
        return "" + color + " " + type + " sLength: " + sepalLength +
                ", p: " + price;
    }
}
