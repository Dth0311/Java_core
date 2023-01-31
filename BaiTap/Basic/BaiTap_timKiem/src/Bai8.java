import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu:");
        var str = scanner.nextLine();
        countLetters(str);
    }

    private static void countLetters(String str) {
        System.out.println("Cac ky tu va so lan xuat hien:");
        for (int i = 0; i < str.length(); i++) {
            if (!isExist(str,str.charAt(i),i)){
                var result = count(str,str.charAt(i));
                System.out.println("\'" + str.charAt(i) + "\'" + " : " + result);
            }
        }
    }

    private static int count(String str, char charAt) {
        var counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charAt== str.charAt(i)){
                counter++;
            }
        }
        return counter;
    }

    private static boolean isExist(String str, char charAt, int i) {
        for (int j = 0; j < i; j++) {
            if (str.charAt(j) == charAt){
                return true;
            }
        }
        return false;
    }
}
