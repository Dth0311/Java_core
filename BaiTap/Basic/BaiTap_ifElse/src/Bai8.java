import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = scanner.nextLine();
        var tg = str.charAt(0);
        var tg2 = str.charAt(str.length()-1);
        if (tg == tg2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
