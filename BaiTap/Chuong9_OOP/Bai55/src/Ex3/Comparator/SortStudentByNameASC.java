package Ex3.Comparator;

import Ex3.Student;

import java.util.Comparator;

public class SortStudentByNameASC implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
