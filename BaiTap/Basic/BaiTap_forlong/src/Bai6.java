import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <m*2 ; j++) {
                if (i+j==m+1 || j-i+1==m || i==m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
