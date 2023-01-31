package Ex3.Comparator;

import Ex3.Instructor;

import java.util.Comparator;

public class SortInstructorByNameASC implements Comparator<Instructor> {

    @Override
    public int compare(Instructor o1, Instructor o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}
