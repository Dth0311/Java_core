package Ex1.Comparator;

import Ex1.Animal;

import java.util.Comparator;

public class SortByWeightASC implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getHeight() < o2.getHeight()) {
            return -1;
        }
        if (o1.getHeight() == o2.getHeight()) {
            return 0;
        }
        return 1;
    }
}
