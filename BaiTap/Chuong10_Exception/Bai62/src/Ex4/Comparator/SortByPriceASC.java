package Ex4.Comparator;


import Ex4.SmartPhone;

import java.util.Comparator;

// sắp xếp theo giá tăng dần
public class SortByPriceASC implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        if (o1.getPrice() < o2.getPrice()){
            return -1;
        }
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        }
        return 0;
    }
}
