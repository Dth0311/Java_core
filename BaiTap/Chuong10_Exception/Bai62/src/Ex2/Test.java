package Ex2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("0355888068");
        BankAccount account2 = new BankAccount("0355888088");
        var input = new Scanner(System.in);
        // nạp tiền vào tài khoản
        try {
            deposit(account1,input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }

        System.out.println("==============================");
        // rút tiền
        try {
            withdraw(account1,input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        System.out.println("======================================");
        // chuyển tiền
        try {
            transfer(account1, account2, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        System.out.println("======================================");
        // thanh toán hóa đơn
        try {
            payTheBill(account1, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
    }

    private static void payTheBill(BankAccount account1, Scanner input)
            throws InvalidAmountException {
        System.out.println("Nhập số tiền cần thanh toán: ");
        var amountStr = input.nextLine().trim(); // nhập vào loại bỏ dấu cách thừa
        var amount = Long.parseLong(amountStr);
        System.out.println("Số dư ban đầu: " + account1.getBallance());
        try {
            account1.payBill(amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }

    private static void transfer(BankAccount account1,
                                 BankAccount account2, Scanner input)
            throws InvalidAmountException {
        System.out.println("Nhập số tiền cần chuyển: ");
        var amountStr = input.nextLine().trim(); // nhập vào loại bỏ dấu cách thừa
        var amount = Long.parseLong(amountStr);
        try {
            System.out.println("Số dư ban đầu: " + account1.getBallance());
            account1.transfer(account2, amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }

    private static void withdraw(BankAccount account1, Scanner input) throws InvalidAmountException{
        System.out.println("Nhập số tiên cần rút: ");
        var amountStr = input.nextLine().trim();
        var amount = Long.parseLong(amountStr);
        System.out.println("Số dư ban đầu: " + account1.getBallance());
        try {
            account1.withdraw(amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }

    private static void deposit(BankAccount account1, Scanner input) throws InvalidAmountException{
        System.out.println("Nhập số tiền cần nạp vào tài khoản: ");
        var amountStr = input.nextLine().trim();
        var amount = Long.parseLong(amountStr);
        System.out.println("Số dư ban đầu: " + account1.getBallance());
        try {
            account1.deposit(amount);
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Giao dịch thất bại");
        }
    }
}
