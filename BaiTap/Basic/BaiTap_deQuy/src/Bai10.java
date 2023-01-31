import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        var n = scanner.nextInt();
        System.out.println("S= " + s(n));
    }

    private static double s(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1.0 / n + s(n - 1);
        }
    }
}
