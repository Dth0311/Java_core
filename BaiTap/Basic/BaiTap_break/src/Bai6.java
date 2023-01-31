import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime;
        int n;
        do {
             n = scanner.nextInt();
             isPrime = true;
             if (n<2){
                 isPrime = false;
             }
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n%i==0){
                    isPrime = false;
                }
            }
        }while (!isPrime);
        System.out.println("n=" + n);
    }
}
