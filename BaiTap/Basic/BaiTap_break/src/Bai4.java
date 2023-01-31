import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a,b,k:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        var lowBound = (int)Math.ceil(Math.sqrt(a));
        var heightBound = (int)Math.floor(Math.sqrt(b));
        for (int i = lowBound; i <=heightBound ; i++) {
            if (i*i%k==0){
                System.out.println("Gia tri dau tien thoa man:" + i*i);
                break;
            }
        }
    }
}
