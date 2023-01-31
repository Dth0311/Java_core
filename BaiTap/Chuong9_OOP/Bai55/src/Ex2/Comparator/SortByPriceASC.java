package Ex2.Comparator;

import Ex2.Vehicle;

import java.util.Comparator;

public class SortByPriceASC implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        return 1;
    }
}
