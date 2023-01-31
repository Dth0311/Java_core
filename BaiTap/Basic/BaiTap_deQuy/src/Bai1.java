import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Giai thua n:" + factorial(6));
    }

    private static long factorial(int n) {
        if (n<2){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
