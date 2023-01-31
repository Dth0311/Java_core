import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        System.out.println("so chu so cua n:" + count);
    }
}
