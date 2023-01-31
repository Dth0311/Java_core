import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập goc:");
        int n = scanner.nextInt();
        System.out.println("sin(" + n + ")=" + Math.sin(Math.toRadians(n)));
        System.out.println("cos(" + n + ")=" + Math.cos(Math.toRadians(n)));
        System.out.println("tan(" + n + ")=" + Math.tan(Math.toRadians(n)));

    }
}
