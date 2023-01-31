import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang:");
        var choice = scanner.next().charAt(0);
        System.out.println(result(choice));
    }

    private static String result(int choice) {
        return switch (choice) {
            case 0 -> "Xin chao va hen gap lai";
            case 1, 2, 3 -> "Mua xuan";
            case 4, 5, 6 -> "Mua ha";
            case 7, 8, 9 -> "Mua thu";
            case 10, 11, 12 -> "Mua dong";
            default -> "Gia tri nay khong hop le, vui long nhap gia tri trong doan [0,12]";
        };
    }
}
