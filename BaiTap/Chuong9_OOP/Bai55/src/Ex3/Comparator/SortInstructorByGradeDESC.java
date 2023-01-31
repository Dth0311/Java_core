package Ex3.Comparator;

import Ex3.Instructor;
import Ex3.Student;

import java.util.Comparator;

public class SortInstructorByGradeDESC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getAvgGrade() < o1.getAvgGrade()){
            return -1;
        }
        if (o2.getAvgGrade() > o1.getAvgGrade()){
            return 1;
        }
        return 0;
    }
}
