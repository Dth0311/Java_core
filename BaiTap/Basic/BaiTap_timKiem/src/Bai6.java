import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        var n = scanner.nextInt();
        var students = getStudents(n, scanner);
        countName(students);
    }

    private static void countName(String[] students) {
        System.out.printf("%-5s%-10s\n", "Ten", "Xuat hien");
        for (int i = 0; i < students.length; i++) {
            var isExist = false;
            for (int j = 0; j < i; j++) {
                if (students[j].toLowerCase().compareTo(students[i].toLowerCase()) == 0) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                var count = numOfExist(students, students[i]);
                System.out.printf("%-5s:%-10s\n", students[i], count);
            }
        }
    }

    private static int numOfExist(String[] students, String student) {
        var count = 0;
        for (var s : students) {
            if (student.toLowerCase().compareTo(s.toLowerCase()) == 0) {
                count++;
            }
        }
        return count;
    }

    private static String[] getStudents(int n, Scanner scanner) {
        var students = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ten hoc sinh thu " + (i + 1) + ":");
            students[i] = scanner.next();
        }
        return students;
    }
}
