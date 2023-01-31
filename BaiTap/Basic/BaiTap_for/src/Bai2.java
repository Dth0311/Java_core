import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        var n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("S= " + sum);
    }
}
