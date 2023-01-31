import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao thu trong tuan:");
        var dayOfWeek = scanner.nextLine();
        dayOfWeek = dayOfWeek.toLowerCase();
        dayOfWeek = dayOfWeek.trim();
        var result = switch (dayOfWeek) {
            case "thứ hai"-> "Monday";
            case "thứ ba"->"Tuesday";
            case "thứ tư"-> "Wednesday";
            case "thứ năm"-> "Thursday";
            case "thứ sáu"-> "Friday";
            case "thứ bảy"-> "Saturday";
            case "chủ nhật"-> "Sunday";
            default-> "Invalid day of week";
        };
        System.out.println("Day of week in english:" + result);
    }
}
