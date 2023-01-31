import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao thu trong tuan:");
        var dayOfWeek = scanner.nextLine();
        var result = "";
        dayOfWeek = dayOfWeek.toLowerCase();
        dayOfWeek = dayOfWeek.trim();
        switch (dayOfWeek) {
            case "thứ hai":
                System.out.println("Monday");
                break;
            case "thứ ba":
                System.out.println("Tuesday");
                break;
            case "thứ tư":
                System.out.println("Wednesday");
                break;
            case "thứ năm":
                System.out.println("Thursday");
                break;
            case "thứ sáu":
                System.out.println("Friday");
                break;
            case "thứ bảy":
                System.out.println("Saturday");
                break;
            case "chủ nhật":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of week");
                break;
        }
    }
}
