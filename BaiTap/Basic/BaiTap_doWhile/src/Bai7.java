import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        double sum = 1;
        while (n>1){
            sum+=1.0/Math.pow(n,2);
            n--;
        }
        System.out.println("Sum=" + sum);
    }
}
