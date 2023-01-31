import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cau tieng anh:");
        var str = scanner.nextLine();
        var count = countVow(str.toLowerCase());
        System.out.println("So nguyen am:" + count);
    }

    private static int countVow(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'a' || str.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }
}
