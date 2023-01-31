import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        Arrays.sort(numbers);
        showResult(numbers);
    }

    private static void showResult(int[] numbers) {
        int second = secondMax(numbers);
        System.out.println("Gia tri lon thu hai:" + second);
        System.out.print("Vi tri cac gia tri lon thu 2:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == second){
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
    private static int maxValue (int[] numbers){
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
    private static int secondMax(int[] numbers){
        int max = maxValue(numbers);
        int max2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max){
                continue;
            }
            else {
                if (numbers[i] > max2){
                    max2 = numbers[i];
                }
            }
        }
        return max2;
    }
}
