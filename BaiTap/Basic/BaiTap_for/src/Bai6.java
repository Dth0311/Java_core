import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Khong phai so nguyen to");
        } else if (n % 2 == 0) {
            System.out.println("Khong phai so nguyen to");
        } else {
            int count = 0;
            for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("n la so nguyen to");
            } else {
                System.out.println("n khong phai so nguyen to");
            }
        }
    }
}
