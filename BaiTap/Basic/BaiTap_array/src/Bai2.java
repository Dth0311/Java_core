import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        var n = scanner.nextInt();
        var primes = firstPrime(n);
        showResult(primes);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] firstPrime(int n) {
        var primes = new int[n];
        var count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
            i++;
        }
        return primes;
    }

    private static void showResult(int[] primes) {
        System.out.println("Danh sach " + primes.length + " so nguyen to dau tien");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}
