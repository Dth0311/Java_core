import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (i==1 || i==m || j==1 || j==m ||i==j || j==m-i+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
