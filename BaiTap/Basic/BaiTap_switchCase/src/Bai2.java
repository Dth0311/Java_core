import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thu tu:");
        var choice = scanner.nextInt();
        switch (choice){
            case 0:
                System.out.println("Xin chao va hen gap lai");
                break;
            case 1:
                System.out.println("Con chuot");
                break;
            case 2:
                System.out.println("Con trau");
                break;
            case 3:
                System.out.println("Con ho");
                break;
            case 4:
                System.out.println("Con meo");
                break;
            case 5:
                System.out.println("Con rong");
                break;
            case 6:
                System.out.println("Con ran");
                break;
            case 7:
                System.out.println("Con ngua");
                break;
            case 8:
                System.out.println("Con de");
                break;
            case 9:
                System.out.println("Con khi");
                break;
            case 10:
                System.out.println("Con ga");
                break;
            case 11:
                System.out.println("Con cho");
                break;
            case 12:
                System.out.println("Con lon");
            default:
                System.out.println("Gia tri nay khong hop le, vui long nhap gia tri trong doan [0,12]");
                break;
        }
    }
}
