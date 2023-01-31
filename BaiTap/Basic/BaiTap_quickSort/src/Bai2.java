import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        var n = scanner.nextInt();
        var grades = getgrades(n,scanner);
        //Arrays.sort(grades);
        bublesort(grades);
        showResult(grades);
    }

    private static void bublesort(float[] grades) {
        for (int i = 0; i < grades.length-1; i++) {
            for (int j = grades.length-1; j >i ; j--) {
                if (grades[j] > grades[j-1]){
                    float tg = grades[j];
                    grades[j] = grades[j-1];
                    grades[j-1] = tg;
                }
            }
        }
    }

    private static void showResult(float[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
    }

    private static float[] getgrades(int n, Scanner scanner) {
        var grades = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            grades[i] = scanner.nextFloat();
        }
        return grades;
    }
}
