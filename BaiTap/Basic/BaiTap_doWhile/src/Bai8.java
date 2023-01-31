import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        while (n>10){
            n/=10;
        }
        System.out.println(n);
    }
}
