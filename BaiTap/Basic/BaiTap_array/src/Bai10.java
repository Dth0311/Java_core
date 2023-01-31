import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so cong nhan:");
        var n = scanner.nextInt();
        var works = getWorks(n,scanner);
        showResult(works);
    }

    private static void showResult(float[] works) {
        System.out.println("Thong tin cham cong tung nhan vien");
        System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n", "STT",
                "Số công", "Lương cứng", "Phụ cấp", "Bonus", "Tổng lương");
        for (int i = 0; i < works.length; i++) {
            var standard = 330 * works[i];
            var pensision = 33 * (int) works[i];
            var bonusDay = (works[i] -25>=0) ? (works[i]-24) : 0;
            var bonus = bonusDay*50;
            var total = standard + pensision + bonus;
            System.out.printf("%-5d%-10.2f%-15.2f%-10d%-10.2f%-12.2f\n",
                    i + 1, works[i], standard, pensision, bonus, total);
        }
    }

    private static float[] getWorks(int n, Scanner scanner) {
        var works = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Cong cua cong nhan thu " + (i+1) + ":");
            works[i] = scanner.nextFloat();
        }
        return works;
    }
}
