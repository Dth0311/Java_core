package Ex4.Comparator;

import Ex4.SmartPhone;

import java.util.Comparator;

public class SortByYearASC implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getYear() - o2.getYear();
    }
}
