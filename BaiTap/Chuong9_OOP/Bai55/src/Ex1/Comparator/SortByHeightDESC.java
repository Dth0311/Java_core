package Ex1.Comparator;

// Sắp xếp chiều cao giảm dần

import Ex1.Animal;

import java.util.Comparator;

public class SortByHeightDESC implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o2.getHeight() < o1.getHeight()) {
            return -1;
        }
        if (o2.getHeight() == o1.getHeight()) {
            return 0;
        }
        return 1;
    }
}
