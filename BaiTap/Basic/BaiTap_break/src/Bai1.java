import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <=n ; i++) {
            boolean tg = true;
            var bound = (int)Math.sqrt(i);
            for (int j =2; j <= bound ; j++) {
                if (i%j==0){
                    tg = false;
                    break;
                }
            }
            if (tg && n%i ==0){
                System.out.println("Uoc so nguyen to nho nhat:" + i);
            }
        }
    }
}
