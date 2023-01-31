import java.util.Scanner;

public class Bai1 {
    enum Season {
        SPRING("Mùa xuân"), SUMMER("Mùa hạ"),
        FALL("Mùa thu "), WINTER("Mùa đông");
        private String value;

        Season(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị[0,12]:");
        var month = scanner.nextInt();
        var season = getSeason(month);
        System.out.println("Thang " + month + " la " + season);
    }

    private static String getSeason(int month) {
        String season = switch (month){
            case 0 -> "Ket thuc chuong trinh!";
            case 1,2,3 -> Season.SPRING.getValue();
            case 4,5,6 -> Season.SUMMER.getValue();
            case 7,8,9 -> Season.FALL.getValue();
            case 10,11,12 -> Season.WINTER.getValue();
            default -> "Gia tri khong hop le vui long nhap lai!";
        };
        return season;
    }
}
