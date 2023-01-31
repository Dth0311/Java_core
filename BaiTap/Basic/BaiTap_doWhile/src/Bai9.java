import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        int sum = n%10;
        while (n>10){
            n/=10;
        }
        System.out.println("Tong chu so dau va cuoi la:" + (sum+n));
    }
}
