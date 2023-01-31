import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = scanner.nextLine();
        if (str.matches("^\\s+.*")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
