import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        System.out.println("Mang sau khi nhap:");
        showArray(numbers);
        System.out.println("Mang sau khi loc:");
        filter(numbers);
    }

    private static void filter(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (!isExist(numbers,numbers[i],i)){
                System.out.print(numbers[i] + " ");
            }
        }
    }

    private static boolean isExist(int[] numbers, int number, int i) {
        for (int j = 0; j < i; j++) {
            if (numbers[j] == number){
                return true;
            }
        }
        return false;
    }

    private static void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
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

