import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai so:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<b){
            System.out.println(a + "<" + b);
        }
        else if (a>b){
            System.out.println(a + ">" + b);
        }
        else {
            System.out.println(a + "=" + b);
        }
    }
}
