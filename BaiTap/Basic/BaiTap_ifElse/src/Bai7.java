import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String str = scanner.nextLine();
        if (str.matches("^[A-Z].*")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
