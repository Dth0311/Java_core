import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong diep:");
        var str = scanner.nextLine();
        System.out.print("Thong diep duoc viet nguoc lai:" );showRevert(str);
    }

    private static void showRevert(String str) {
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
