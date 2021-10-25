package flowers;

import java.util.*;

public class FlowerGenerator {

    private static double randomDouble(int leftLimit, int rightLimit) {
        double generatedDouble = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);
        return Math.round(generatedDouble*100.0)/100.0;
    }

    public static List<Flower> generateFlowers(int size){
        List<Flower> flowers = new ArrayList<Flower>();
        Random random = new Random();

        List<FlowerType> FT = Arrays.asList(FlowerType.values());
        List<Color> COLORS = Arrays.asList(Color.values());

        for (int i = 0; i<size;i++){
            Flower flower = new Flower(FT.get(random.nextInt(FT.size())),COLORS.get(random.nextInt(COLORS.size())), randomDouble(1,10), randomDouble(10,100));
            flowers.add(flower);
        }
        return flowers;
    }
}
