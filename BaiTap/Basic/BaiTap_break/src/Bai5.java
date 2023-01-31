import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var m = scanner.nextInt();
        var k = scanner.nextInt();
        var count = 0;
        for (int i = 10000; i <= 99999; i++) {
            int j = i;
            int tong = 0;
            while (j > 0) {
                tong += j % 10;
                j /= 10;
            }
            if (tong % m == 0) {
                System.out.print(i + " ");
                count++;
                if (count == k) {
                    break;
                }
            }
        }
    }
}
