import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba so thuc:");
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        var min = minValue(a, b, c);
        System.out.println("Min = " + min);
    }

    private static Double minValue(double a, double b, double c) {
        double m = (a > b) ? b : (a > c ? c : a);
        return m;
    }
}
