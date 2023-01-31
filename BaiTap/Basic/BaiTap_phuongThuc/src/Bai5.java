import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba so thuc:");
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        var avg = findAvg(a, b, c);
        System.out.println("Trung binh cong:" + avg);
    }

    private static double findAvg(double a, double b, double c) {
        return (a+b+c)/3;
    }
}
