import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu:");
        var str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(i==0){
                System.out.println(str.charAt(i));
            }
            if(str.charAt(i) == ' '){
                System.out.println(str.charAt(i+1));
            }
        }
    }
}
