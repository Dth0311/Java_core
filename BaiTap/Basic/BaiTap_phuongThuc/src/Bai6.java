import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        var n = scanner.nextInt();
        var first = firstNumber(n);
        System.out.println("So dau tien la:" + first);
    }

    private static int firstNumber(int n) {
        while (n>10){
            n/=10;
        }
        return n;
    }
}
