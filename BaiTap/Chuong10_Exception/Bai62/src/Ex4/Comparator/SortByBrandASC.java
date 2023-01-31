package Ex4.Comparator;

import Ex4.SmartPhone;

import java.util.Comparator;


// sắp xếp theo tên hãng
public class SortByBrandASC implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
