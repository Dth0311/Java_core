import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        var a = scanner.nextDouble();
        System.out.println("Nhập b:");
        var b = scanner.nextDouble();
        System.out.println("Min:" + Math.min(a,b));
        System.out.println("Max:" + Math.max(a,b));
    }

}
