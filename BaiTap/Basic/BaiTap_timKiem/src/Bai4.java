import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so sinh vien:");
        var n = scanner.nextInt();
        System.out.print("x=");
        var x = scanner.nextFloat();
        var grades = getGrades(n, scanner);
        quickSort(grades);
        System.out.println("Mang sau khi sap xep:");
        showArrays(grades);
        var index = Arrays.binarySearch(grades,x);
        var result = index < 0 ? "Khong ton tai x" :
                "Co ton tai x";
        System.out.println(result);
    }

    private static void showArrays(float[] grades) {
        for (var gra : grades) {
            System.out.print(gra + " ");
        }
    }

    private static void quickSort(float[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = grades.length - 1; j > i; j--) {
                if (grades[j] < grades[j - 1]) {
                    float tg = grades[j];
                    grades[j] = grades[j - 1];
                    grades[j - 1] = tg;
                }
            }
        }
    }

    private static float[] getGrades(int n, Scanner scanner) {
        var grades = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap diem trung binh cua hs " + (i + 1) + ":");
            grades[i] = scanner.nextFloat();
        }
        return grades;
    }
}
