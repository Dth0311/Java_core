import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai so nguyen duong:");
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        System.out.println("Uoc chung lon nhat:" + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a < b) {
            return gcd(a, b - a);
        } else {
            return gcd(a - b, b);
        }
    }
}
