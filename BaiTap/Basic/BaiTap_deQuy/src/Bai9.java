import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        var n = scanner.nextInt();
        System.out.println("1+...+n=" + sum(n));
    }

    private static long sum(int n) {
        if (n<2){
            return 1;
        }
        else {
            return n + sum(n-1);
        }
    }
}
