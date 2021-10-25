package flowers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Store myStore = new Store(FlowerGenerator.generateFlowers(random.nextInt(100 - 1) + 1), FlowerGenerator.generateFlowers(random.nextInt(100 - 1) + 1));

        Color paramOne = Color.RED;
        FlowerType paramTwo = FlowerType.ROSE;

        myStore.search(paramOne);
        myStore.search(paramTwo);
        myStore.reset();
    }
}
