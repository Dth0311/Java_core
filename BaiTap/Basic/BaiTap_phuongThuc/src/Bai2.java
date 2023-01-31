import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        var n = scanner.nextInt();
        boolean isRe = isRevert(n);
        System.out.println(isRe ? "La so thuan nghich" : "Khong phai so thuan nghich");
    }

    private static boolean isRevert(int n) {
        int m = n;
        int rev = 0;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        if (rev == n) {
            return true;
        }
        return false;
    }
}
