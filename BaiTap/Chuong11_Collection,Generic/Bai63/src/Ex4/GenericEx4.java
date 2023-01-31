package Ex4;

import Ex1.Student;

public class GenericEx4 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 6, 5, 2, 4, 7, 8};
        Double[] interestRate = {0.25, 1.5, 6.35, 4.75, 5.5};
        Student[] students = new Student[3];
        students[0] = new Student("S1", "Tran Van Hung", 3.25f);
        students[1] = new Student("S2", "Nguyen Tran Duy", 2.59f);
        students[2] = new Student("S3", "Hoang Xuan Quynh", 3.54f);

        System.out.println("Số lần xuất hiện:" + Count(numbers,5));
    }

    public static <T extends Comparable> int Count(T[] elements,T x){
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].compareTo(x)==0){
                count += 1;
            }
        }
        return count;
    }
}
