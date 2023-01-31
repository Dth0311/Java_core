import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n, scanner);
        var sum = sumPrimeNumbers(numbers);
        showArray(numbers);
        System.out.println("Tong cac so nguyen to:" + sum);
    }

    private static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    private static long sumPrimeNumbers(int[] numbers) {
        long s = 0;
        for (var number:numbers) {
            if (isPrime(number)){
                s+=number;
            }
        }
        return s;
    }

    private static void showArray(int[] numbers) {
        System.out.print("Cac phan tu cua mang:");
        for (var number : numbers) {
            System.out.print(number + " ");
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
