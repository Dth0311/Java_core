package Ex2.Comparator;

import Ex2.Vehicle;

import java.util.Comparator;

public class SortByYearASC implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o2.getYear() - o1.getYear();
    }
}
