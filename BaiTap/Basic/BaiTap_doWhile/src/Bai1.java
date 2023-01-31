import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        int i=1;
        while (i<=n){
            if(n%i==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
