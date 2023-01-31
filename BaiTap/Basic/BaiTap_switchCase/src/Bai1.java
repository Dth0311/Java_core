import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang:");
        var choice = scanner.nextInt();
        switch (choice){
            case 0:
                System.out.println("Xin chao va hen gap lai");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Mua xuan");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Mua ha");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Mua thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Mua dong");
                break;
            default:
                System.out.println("Gia tri nay khong hop le, vui long nhap gia tri trong doan [0,12]");
                break;
        }
    }
}
