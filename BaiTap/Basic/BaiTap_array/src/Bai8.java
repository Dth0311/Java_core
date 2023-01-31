import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n, scanner);
        showResult(numbers);
    }

    private static void showResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(splitToPrime(numbers[i]));
        }
    }

    private static int[] getNumbers(int n, Scanner scanner) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static String splitToPrime(int n) {
        String res = n + "= ";
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                res += i;
                if (n != i) {
                    res += "*";
                }
                n /= i;
            } else {
                i++;
            }

        }
        return res;
    }
}
