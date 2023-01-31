import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a,b(a<b):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <=b ; i++) {
            boolean tg = true;
            if (i<2){
                tg = false;
            }
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i%j==0){
                    tg = false;
                }
            }
            System.out.print(tg ? i + "," : "");
        }
    }
}
