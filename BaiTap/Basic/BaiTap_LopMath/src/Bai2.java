import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = scanner.nextInt();
        System.out.println("Căn bậc 2:" + Math.sqrt(n));
        System.out.println("Căn bậc 3:" + Math.cbrt(n));
    }
}
