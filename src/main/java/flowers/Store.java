package flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter @Getter
public class Store {
    private List<Flower> flowersChoices;
    private List<Flower> lastFiltered;

    public Store(List<Flower> flowersChoices, List<Flower> lastFiltered) {
        this.flowersChoices = flowersChoices;
        this.lastFiltered = lastFiltered;
    }


    private void print(List<Flower> input) {
        System.out.println(input);
    }

    public List<Flower> search(Color searchedColor) {
        List<Flower> selectedFlowers = new ArrayList<Flower>();

        for (Flower fl: this.lastFiltered) {
            if (fl.color == searchedColor) {
                selectedFlowers.add(fl);
            }
        }

        print(selectedFlowers);
        this.lastFiltered = selectedFlowers;
        return selectedFlowers;
    }

    public List<Flower> search(FlowerType type) {
        List<Flower> selectedFlowers = new ArrayList<Flower>();

        for (Flower fl: this.lastFiltered) {
            if (fl.type == type) {
                selectedFlowers.add(fl);
            }
        }
        print(selectedFlowers);
        this.lastFiltered = selectedFlowers;
        return selectedFlowers;
    }

    public List<Flower> search(double param, String key) {
        List<Flower> selectedFlowers = new ArrayList<Flower>();

        if (key=="p") {
            for (Flower fl: this.lastFiltered) {
                if (fl.price <= param) {
                    selectedFlowers.add(fl);
                }
            }
        }

        else if (key=="s") {
            for (Flower fl: this.lastFiltered) {
                if (fl.sepalLength <= param) {
                    selectedFlowers.add(fl);
                }
            }
        }
        print(selectedFlowers);
        this.lastFiltered = selectedFlowers;
        return selectedFlowers;
    }

    public void reset() {
        this.lastFiltered = this.flowersChoices;
    }
}
