import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu:");
        var str= scanner.nextLine();
        var count =1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("So tu:" + count);
    }
}
