import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        var uoc = 0;
        for (i = 2; i <=n ; i++) {
            boolean tg = true;
            var bound = (int)Math.sqrt(i);
            for (int j =2; j <= bound ; j++) {
                if (i%j==0){
                    tg = false;
                    break;
                }
            }
            if (tg && n%i ==0){
                uoc= i;
            }
        }
        System.out.println("Uoc so nguyen to nho nhat:" + uoc);
    }
}
