import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba so thuc:");
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        var max = maxValue(a, b, c);
        System.out.println("Max = " + max);
    }

    private static double maxValue(double a, double b, double c) {
        double m = (a > b) ? a : (b > c ? b : c);
        return m;
    }
}
