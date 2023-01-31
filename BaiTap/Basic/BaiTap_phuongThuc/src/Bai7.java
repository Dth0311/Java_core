import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap n:");
            var n = scanner.nextInt();
            var sum = sumNumber(n);
            System.out.println("Tong cac chu so la:" + sum);
    }

    private static int sumNumber(int n) {
        int tong = 0;
        while (n>0){
            tong+= n%10;
            n/=10;
        }
        return tong;
    }
}
