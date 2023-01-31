import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        var str = scanner.nextLine();
        System.out.println("Chuoi nguoc lai:");
        showRevert(str,str.length()-1);
    }

    private static void showRevert(String str, int pos) {
        if (pos>=0){
            System.out.print(str.charAt(pos));
            showRevert(str,pos-1);
        }
    }
}
