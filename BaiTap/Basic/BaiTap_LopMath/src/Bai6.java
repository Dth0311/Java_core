import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        var a = scanner.nextDouble();
        System.out.println("Nhập b:");
        var b = scanner.nextDouble();
        System.out.println("a^b=" + Math.pow(a,b));
        System.out.println("b^a=" + Math.pow(b,a));
    }
}
