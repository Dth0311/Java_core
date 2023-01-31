package Ex2;

public class BankAccount {
    private String cardNumber;
    private String accNumber;
    private String owner;
    private long ballance;

    public BankAccount() {
    }

    public BankAccount(String accNumber) {
        this.accNumber = accNumber;
    }

    public BankAccount(String cardNumber, String accNumber,
                       String owner, long ballance) {
        this.cardNumber = cardNumber;
        this.accNumber = accNumber;
        this.owner = owner;
        this.ballance = ballance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBallance() {
        return ballance;
    }

    public void setBallance(long ballance) {
        this.ballance = ballance;
    }

    // nạp tiền
    public void deposit(long amount) throws InvalidAmountException{
        if (amount > 0){
            ballance += amount;
            System.out.println("Giao dịch nạp tiền vào tài khoản " + accNumber + " hoàn tất");
        }else {
            var msg = "Số tiền giao dịch không hợp lệ " + amount;
            throw new InvalidAmountException(msg,amount);
        }
    }

    // rút tiền
    public void withdraw(long amount) throws InvalidAmountException {
        // nếu số tiền cần chuyển khoản hợp lệ và nhở hơn hoặc bằng số dư
        if (isValid(amount) && amount <= ballance){
            ballance -= amount;
            System.out.println("Giao dịch rút tiền hoàn tất!");
        }else {
            var msg = "Số tiền giao dịch không hợp lệ " + amount;
            throw new InvalidAmountException(msg,amount);
        }
    }

    // chuyển tiền
    public void transfer(BankAccount acc,long amount) throws InvalidAmountException {
        // nếu số tiền chuyển hợp lệ và nhỏ hơn hoặc bằng số dư
        if (isValid(amount) && amount <= ballance){
            ballance -= amount; // trừ tiền vào tài khoản gửi
            acc.deposit(amount); // thêm tiền vào tài khoản thụ hưởng
            System.out.println("Giao dịch chuyển tiền hoàn tất!");
        }else {
            var msg = "Sô tiền giao dịch không hợp lệ " + amount;
            throw new InvalidAmountException(msg,amount);
        }
    }

    // thành toán hóa đơn
    public void payBill(long amount) throws InvalidAmountException {
        if (isValid(amount) && amount <= ballance){
            ballance -= amount;
            System.out.println("Thanh toán hóa đơn thành công");
        }else {
            var msg = "Số tiền giao dịch không hợp lệ " + amount;
            throw new InvalidAmountException(msg,amount);
        }
    }

    private boolean isValid(long amount) {
        return amount >= 0 && amount <= ballance;
    }
}
