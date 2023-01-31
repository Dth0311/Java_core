import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap r:");
        double r = scanner.nextDouble();
        System.out.println("Chu vi:" + (2*Math.PI*r));
        System.out.println("Dien tich:" + (Math.PI*r*r));
    }
}
