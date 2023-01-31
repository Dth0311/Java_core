import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba so thuc:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if(a+b<c || a+c<b || b+c<a || a<0 || b<0 || c<0){
            System.out.println("Khong");
        }
        else {
            System.out.println("Co");
        }
    }
}
