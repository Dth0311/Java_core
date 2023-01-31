import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        showArrays(numbers);
        Arrays.sort(numbers,0,numbers.length/2);
        sort(numbers);
        System.out.println("Mang sau khi sap xep:");
        showArrays(numbers);
    }

    private static void sort(int[] numbers) {
        for (int i = numbers.length/2 ; i < numbers.length-1; i++) {
            for (int j = numbers.length-1; j >i ; j--) {
                if (numbers[j] < numbers[j-1]){
                    var tg = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tg;
                }

            }
        }
    }

    private static void showArrays(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
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
}
