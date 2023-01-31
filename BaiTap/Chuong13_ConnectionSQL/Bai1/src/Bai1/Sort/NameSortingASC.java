package Bai1.Sort;

import Bai1.Cat;

import java.util.Comparator;

public class NameSortingASC implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getPetName().compareTo(o2.getPetName());
    }
}
