package Ex3.Comparator;

import Ex3.Instructor;

import java.util.Comparator;

public class SortInstructorByExperienceDESC implements Comparator<Instructor> {

    @Override
    public int compare(Instructor o1, Instructor o2) {
        if(o2.getExperience() < o1.getExperience()){
            return -1;
        }
        if(o2.getExperience() > o1.getExperience()){
            return 1;
        }
        return 0;
    }
}
