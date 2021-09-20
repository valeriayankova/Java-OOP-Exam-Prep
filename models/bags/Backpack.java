package spaceStation.models.bags;

import java.util.ArrayList;
import java.util.List;

public class Backpack implements Bag {
    private List<String> items;

    public Backpack() {
        this.items = new ArrayList<>();
    }

    @Override
    public List<String> getItems() {
        return this.items;
    }
}
