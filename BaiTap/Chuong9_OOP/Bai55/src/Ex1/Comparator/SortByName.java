package Ex1.Comparator;

// Sắp xếp theo tên tăng dần từ a - z

import Ex1.Animal;

import java.util.Comparator;

public class SortByName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
