import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a,b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <=b ; i++) {
            int f0 = 0, f1 = 1, fn = 0;
            for (int j = 2; j <=i ; j++) {
                System.out.print(fn + " ");
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println(fn + " ");
        }
    }
}
