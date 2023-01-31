import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay vs thang sinh:");
        var day = scanner.nextInt();
        var month = scanner.nextInt();
        var zodiac = "";
        zodiac = switch (month) {
            case 1 -> (day < 20) ? "Ma Kết" : (day <= 31) ? "Bảo Bình" : "Ngày không hợp lệ";
            case 2 -> (day < 19) ? "Bảo Bình" : (day <= 29) ? "Song Ngư" : "Ngày không hợp lệ";
            case 3 -> (day < 21) ? "Song Ngư" : (day <= 31) ? "Bạch Dương" : "Ngày không hợp lệ";
            case 4 -> (day < 21) ? "Bạch Dương" : (day <= 30) ? "Kim Ngưu" : "Ngày không hợp lệ";
            case 5 -> (day < 21) ? "Kim Ngưu" : (day <= 31) ? "Song Tử" : "Ngày không hợp lệ";
            case 6 -> (day < 22) ? "Song Tử" : (day <= 30) ? "Cự Giải" : "Ngày không hợp lệ";
            case 7 -> (day < 23) ? "Cự Giải" : (day <= 31) ? "Sư Tử" : "Ngày không hợp lệ";
            case 8 -> (day < 23) ? "Sư Tử" : (day <= 31) ? "Xử Nữ" : "Ngày không hợp lệ";
            case 9 -> (day < 23) ? "Xử Nữ" : (day <= 30) ? "Thiên Bình" : "Ngày không hợp lệ";
            case 10 -> (day < 24) ? "Thiên Bình" : (day <= 31) ? "Bọ Cạp" : "Ngày không hợp lệ";
            case 11 -> (day < 23) ? "Bọ Cạp" : (day <= 30) ? "Nhân Mã" : "Ngày không hợp lệ";
            case 12 -> (day < 22) ? "Nhân Mã" : (day <= 31) ? "Ma Kết" : "Ngày không hợp lệ";
            default -> "Tháng không hợp lệ. Vui lòng kiểm tra lại.";
        };
        System.out.println("Cung hoàng đạo nhà bạn là: " + zodiac);
    }
}
