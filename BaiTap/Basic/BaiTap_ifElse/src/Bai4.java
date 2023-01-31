import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi str1:");
        var str1 = scanner.nextLine();
        System.out.print("Nhap chuoi str2:");
        var str2 = scanner.nextLine();
        var tg = str1.compareTo(str2);
        if (tg < 0){
            System.out.println("str1 dung truoc str2");
        }
        else if (tg > 0){
            System.out.println("str1 dung sau str2");
        }
        else {
            System.out.println("str1 tuong duong str2");
        }
    }
}
