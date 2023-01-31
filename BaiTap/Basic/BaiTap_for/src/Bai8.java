import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n:");
        int n = scanner.nextInt();
        int tg = 0;
        for (int i = n; i > 0; i /= 10) {
            tg = tg * 10 + i % 10;
        }
        System.out.println(n == tg ? "n la so dep" : "n khong phai la so dep");
    }
}
