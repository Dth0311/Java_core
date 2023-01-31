import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so phuong trinh bac hai");
        int a, b, c;
        do {
            System.out.println("a=");
            a = scanner.nextInt();
        } while (a == 0);
        System.out.print("b=");
        b = scanner.nextInt();
        System.out.print("c=");
        c = scanner.nextInt();
        int delta = b*b - 4*a*c;
        if (delta==0){
            System.out.println("Phuong trinh co nghiem kep");
        }
        else if (delta<0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else {
            System.out.println("Phuong trinh co hai nghiem phan biet");
        }
    }
}
