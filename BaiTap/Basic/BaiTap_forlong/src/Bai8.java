import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = m; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j*j == i){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
