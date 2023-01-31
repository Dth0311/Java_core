import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong:");
        var n = scanner.nextInt();
        if (n%2==0){
            System.out.println("Chan");
        }
        else {
            System.out.println("Le");
        }
    }
}
