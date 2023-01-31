import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        var a = scanner.nextDouble();
        System.out.println("Nhập b:");
        var b = scanner.nextDouble();
        System.out.println("a/b=" + Math.ceil(a/b));
    }
}
