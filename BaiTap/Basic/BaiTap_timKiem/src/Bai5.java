import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n, scanner);
        System.out.println("Mang truoc khi sap xep:");
        showArrays(numbers);
        Arrays.sort(numbers,0,numbers.length/2);
        sort(numbers);
        System.out.println("Mang sau khi sap xep:");
        showArrays(numbers);
        if (isSymmetrical(numbers)){
            System.out.println("Mang doi xung");
        }
        else {
            System.out.println("Mang khong doi xung");
        }
    }

    private static boolean isSymmetrical(int[] numbers) {
        for (int i = 0; i < numbers.length/2; i++) {
            if ((numbers[i]) != numbers[numbers.length-1-i]){
                return false;
            }
        }
        return true;
    }

    private static void showArrays(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private static void sort(int[] numbers) {
        for (int i = numbers.length / 2; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int tg = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tg;
                }

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
}
