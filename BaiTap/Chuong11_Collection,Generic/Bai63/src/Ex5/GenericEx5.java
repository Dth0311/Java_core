package Ex5;

import java.util.ArrayList;

public class GenericEx5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Mai");
        friends.add("Anh");
        friends.add("Hoa");
        friends.add("Nhung");
        friends.add("Huong");

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

        sortASC(numbers);
        sortASC(friends);
        sortASC(students);
        System.out.println("===========Danh sách các số================");
        showArrayElement(numbers);
        System.out.println("===========Danh sách tên==============");
        showArrayElement(friends);
        System.out.println("===============Danh sách sinh viên===========");
        showArrayElement(students);

    }

    public static <T> void showArrayElement(ArrayList<T> elements){
        for (var element: elements
             ) {
            System.out.println(element);
        }
    }


    /*
    * phương thức chỉ dùng cho các kiểu có thực thi interface comparable
    * sắp xếp danh sách các phần tử trong danh sách theo thwucs tự tăng dần */
    public static <T extends Comparable> void sortASC(ArrayList<T> elements){
        for (int i = 0; i < elements.size() -1; i++) {
            for (int j = elements.size() - 1;j>i;j--){
                if (elements.get(j).compareTo(elements.get(j-1)) < 0){
                    var tg = elements.get(j);
                    elements.set(j, elements.get(j - 1));
                    elements.set(j - 1,tg );
                }
            }
        }
    }
}
