package Ex8;

import java.util.ArrayList;

public class GenericEx8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Mai");
        friends.add("Anh");
        friends.add("Hoa");
        friends.add("Nhung");
        friends.add("Huong");
        friends.add("Hoa");

        var s1 = new Student("S1", "Tran Van Hung", 3.25f);
        var s2 = new Student("S2", "Nguyen Tran Duy", 2.59f);
        var s3 = new Student("S3", "Hoang Xuan Quynh", 3.54f);
        var s4 = new Student("S7", "Nguyen Hoai Nam", 2.95f);
        var s5 = new Student("S4", "Huynh Lan Huong", 3.66f);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        // tiến hành thay thế các phần tử x bởi phần tử y:
        System.out.println("Sau khi thay thế số 1 bởi 99: ");
        replace(numbers, 1, 99);
        showArray(numbers);
        System.out.println("Sau khi thay thế các Hoa bởi Linh: ");
        replace(friends, "Hoa", "Linh");
        showArray(friends);
        System.out.println("Sau khi thay thế các SV mã S1 bởi SV mã S4: ");
        replace(students, s1, s5); // thay s1 bởi s5
        showArray(students);
    }

    public static <T> void showArray(ArrayList<T> elements){
        for (var element: elements){
            System.out.println(element);
        }
    }

    public static <T extends Comparable> void replace(ArrayList<T> elements,T x,T y){
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).equals(x)) {
                elements.set(i, y);
            }
        }
    }
}
