import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so diem trung binh:");
        var n = scanner.nextInt();
        var grades = getGrades(n, scanner);
        showResult(grades);
    }

    private static float[] getGrades(int n, Scanner scanner) {
        var grades = new float[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextFloat();
        }
        return grades;
    }

    private static String classify(float grade) {
        if (grade < 2.0f) {
            return "Truot";
        } else if (grade < 2.5f) {
            return "Yeu";
        } else if (grade < 3.0f) {
            return "TB";
        } else if (grade < 3.2f) {
            return "Kha";
        } else if (grade < 3.6f) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    private static void showResult(float[] grades) {
        System.out.println("Phan loai ket qua sinh vien:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("STT " + (i + 1)+":" + grades[i] + "->" + classify(grades[i]));
        }
    }
}
