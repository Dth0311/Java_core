import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        var n = scanner.nextInt();
        var students = getStudents(n,scanner);
        var result = avgGrades(students);
        System.out.println("Diem trung binh lop hoc:" + result);
    }

    private static float avgGrades(float[] students) {
        float res = 0;
        for (int i = 0; i < students.length; i++) {
            res+=students[i];
        }
        return res/students.length;
    }

    private static float[] getStudents(int n, Scanner scanner) {
        var students = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            students[i] = scanner.nextFloat();
        }
        return students;
    }
}
