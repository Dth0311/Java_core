package Ex3.Comparator;

import Ex3.Instructor;

import java.util.Comparator;

public class SortInstructorBySalaryDESC implements Comparator<Instructor> {
    @Override
    public int compare(Instructor o1, Instructor o2) {
        if (o2.getSalary() < o1.getSalary()){
            return -1;
        }
        if (o2.getSalary() > o1.getSalary()){
            return 1;
        }
        return 0;
    }
}
