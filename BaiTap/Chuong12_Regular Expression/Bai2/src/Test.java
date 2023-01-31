import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BackAccount account1 = new BackAccount("02132121");
        BackAccount account2 = new BackAccount("13131565");
        var input = new Scanner(System.in);
        // nạp tiền vào tài khoản
        try {
            deposit(account1, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Số dư mới: " + account1.getBallance());
        }
        System.out.println("======================================");
        // rút tiền
        try {
            widthdraw(account1, input);
            System.out.println("Số dư mới: " + account1.getBallance());
        } catch (InvalidAmountException e) {
            e.printStackTrace();
            System.out.println("Số dư mới: " + account1.getBallance());
        }
    }

    private static void widthdraw(BackAccount account1, Scanner input) throws InvalidAmountException {
        System.out.printf("Nhập số tiền cần rút: ");
        var amountStr = input.nextLine().trim();
        if (amountStr.matches("\\d+")){
            var amount = Long.parseLong(amountStr);
            try {
                System.out.println("Số dư ban đầu: "  + account1.getBallance());
                account1.withdraw(amount);
            } catch (InvalidAmountException e) {
                e.printStackTrace();
                System.out.println("Giao dịch thất bại!");
            }
        }else {
            throw new InvalidAmountException("Số tiền giao dịch không hợp lệ !",0);
        }
    }

    private static void deposit(BackAccount account1, Scanner input) throws InvalidAmountException {
        System.out.println("Nhập số tiền cần nạp vào tài khoản: ");
        var amountStr = input.nextLine().trim();
        if (amountStr.matches("\\d+")){
            var amount = Long.parseLong(amountStr);
            try {
                System.out.println("Số dư ban đầu: " + account1.getBallance());
                account1.deposit(amount);
            } catch (InvalidAmountException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }else {
            throw new InvalidAmountException("Số tiền giao dịch không hợp lệ",0);
        }
    }
}
