import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp tài khoản của bạn:");
        var accNum = scanner.nextLine();
        acc.setAccNumber(accNum);
        System.out.print("Nhập tên tài khoản:");
        var owner = scanner.nextLine();
        acc.setOwner(owner);
        System.out.print("Nhập số tiền muốn gửi vào ngân hàng:");
        acc.deposit(scanner.nextLong());

        System.out.println("Số tài khoản:" + acc.getAccNumber());
        System.out.println("Tên tài khoản:" + acc.getOwner());
        System.out.print("Nhập số tiền muốn rút:");
        var amount = scanner.nextLong();
        if (acc.withDraw(amount)){
            System.out.println("Rút thành công");
            acc.checkAccBallance();
        }
        else {
            System.out.println("Số dư của bạn không đủ để thực hiện giao dịch này");
        }
    }
}
