import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        var str = scanner.nextLine();
        String[] words = str.split("\\s+");
        System.out.println("Danh sach sau khi tach:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + "-\"" + words[i] + "\"");
        }
    }
}
