import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai so a,b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int bc= a*b;
        while (a!=b){
            if (a>b){
                a-=b;
            }
            else {
                b-=a;
            }
        }
        bc = bc/a;
        System.out.println("UCLN=" + a);
        System.out.println("BCNN=" + bc);
    }
}
