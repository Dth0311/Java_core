import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong so hinh thang:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        if (a<0 || b<0 || h<0){
            System.out.println("INVALID INPUT");
        }
        else {
            double s = (a+b)*h/2;
            System.out.println("s= " + s);
        }
    }
}
