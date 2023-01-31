import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        var name = scanner.nextLine();
        if (name.matches("^[a-zA-z\\s]+$")){
            System.out.println("Hop le");
        }
        else {
            System.out.println("Khong hop le");
        }
    }
}
