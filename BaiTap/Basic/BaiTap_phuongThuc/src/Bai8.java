import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai so duong:");
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        System.out.println("UCLN(" + a + "," + b + ")" + "="  + gcd(a,b));
    }

    private static int gcd(int a, int b) {
        while (a!=b){
            if (a>b){
                a-=b;
            }
            else {
                b-=a;
            }
        }
        return a;
    }
}
