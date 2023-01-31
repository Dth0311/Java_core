import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        var n = 0;
        int sum = 0;
        for (int i = 1; i<=32; i++) {
            sum += i;
            if (sum >= 500) {
                n = i;
                break;
            }
        }
        System.out.println("n = " + n);
    }
}
