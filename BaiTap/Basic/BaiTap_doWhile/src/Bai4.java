import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String str = scanner.nextLine();
        int tg = str.length();
        while (tg >0){
            System.out.print(str.charAt(tg -1));
            tg--;
        }
    }


}
