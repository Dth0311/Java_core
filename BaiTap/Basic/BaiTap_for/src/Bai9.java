import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        int f0=0,f1=1,fn=0;
        for (int i = 1; i <=n ; i++) {
            System.out.print(fn + " ");
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
    }
}
