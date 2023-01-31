import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thu tu:");
        var choice = scanner.nextInt();
        System.out.print(result(choice));
    }

    private static String result(int choice) {
        return switch (choice) {
            case 0 -> "Xin chao va hen gap lai";
            case 1 -> "Con chuot";
            case 2 -> "Con trau";
            case 3 -> "Con ho";
            case 4 -> "Con meo";
            case 5 -> "Con rong";
            case 6 -> "Con ran";
            case 7 -> "Con ngua";
            case 8 -> "Con de";
            case 9 -> "Con khi";
            case 10 -> "Con ga";
            case 11 -> "Con cho";
            case 12 -> "Con lon";
            default -> "Gia tri nay khong hop le, vui long nhap gia tri trong doan [0,12]";
        };
    }
}
