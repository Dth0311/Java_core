public class Bai2 {
    public static void main(String[] args) {
        System.out.println("fibonacci(n): " + fibo(0));
    }

    private static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
