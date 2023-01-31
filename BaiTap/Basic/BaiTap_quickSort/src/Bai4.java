import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n, scanner);
        bublesort(numbers);
        showArrays(numbers);
        showResult(numbers);
    }

    private static void showArrays(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void bublesort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int tg = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tg;
                }
            }
        }
    }

    private static void showResult(int[] numbers) {
        int second = secondmin(numbers);
        System.out.println("Gia tri lon thu hai:" + second);
        System.out.print("Vi tri cac gia tri lon thu 2:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == second) {
                System.out.print(i + " ");
            }
        }
    }

    private static int[] getNumbers(int n, Scanner scanner) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int minValue(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    private static int secondmin(int[] numbers) {
        int min = minValue(numbers);
        int min2 = 1000000;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                continue;
            } else {
                if (numbers[i] < min2) {
                    min2 = numbers[i];
                }
            }
        }
        return min2;
    }
}
