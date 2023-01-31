import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        var str = scanner.nextLine();
        String[] words = str.split("\\s+");
        System.out.println("Danh sach sau khi viet nguoc:");
        for (int i = words.length-1; i>=0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
