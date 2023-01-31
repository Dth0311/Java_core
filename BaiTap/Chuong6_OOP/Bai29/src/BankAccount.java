public class BankAccount {
    private String accNumber;
    private String owner; // chủ nhân
    private String type; // loại tài khoản
    private long ballance; // số dư
    private String bankName; // tến ngân hàng
    private String startDate; // ngày phát hành
    private String endDate; // ngày hết hạn

    // phương thức khởi tạo mặc định
    public BankAccount() {
        accNumber = "";
        owner = "";
        type = "";
        ballance = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    // phương thức khởi tạo 1 tham số
    public BankAccount(String accNumber) {
        this.accNumber = accNumber;
    }

    // phương thức khởi tạo 2 tham số
    public BankAccount(String accNumber, String owner) {
        this(accNumber); // gọi constructor 1 tham số
        this.owner = owner;
    }

    // phương thức khởi tạo 3 tham số
    public BankAccount(String accNumber, String owner, String type) {
        this(accNumber, owner); // gọi constructor 2 tham số
        this.type = type;
    }

    // phương thức khởi tạo 4 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long ballance) {
        this(accNumber, owner, type); // gọi constructor 3 tham số
        this.ballance = ballance;
    }

    // phương thức khởi tạo 5 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long ballance, String bankName) {
        this(accNumber, owner, type, ballance); // gọi constructor 4 tham số
        this.bankName = bankName;
    }

    // phương thức khởi tạo 6 tham số
    public BankAccount(String accNumber, String owner, String type,
                       long ballance, String bankName, String startDate) {
        // gọi constructor 5 tham số
        this(accNumber, owner, type, ballance, bankName);
        this.startDate = startDate;
    }

    // phương thức khởi tạo 7 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long ballance,
                       String bankName, String startDate, String endDate) {
        // gọi constructor 6 tham số
        this(accNumber, owner, type, ballance, bankName, startDate);
        this.endDate = endDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBallance() {
        return ballance;
    }

    public void setBallance(long ballance) {
        this.ballance = ballance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    // nạp tiền vào tài khoản
    public boolean deposit(long amount){
        if(amount > 0){
            ballance += amount;
            return true;
        }
        return false;
    }
    // rút tiền
    public boolean withDraw(long amount){
        if(amount > 0 && amount <= ballance){
            ballance -= amount;
            return true;
        }
        return false;
    }
    // chuyển khoản
    public boolean bankTransfer(BankAccount other, long amount){
        if (amount > 0 && amount <= ballance){
            ballance -= amount;
            other.ballance += amount;
            return true;
        }
        return false;
    }

    // kiểm tra số dư
    public void checkAccBallance(){
        System.out.println("Số dư hiện tại của bạn là:" + ballance);
    }

    // thanh toán các dịch vụ khác
    public boolean pay(String service, long amount){
        if (!service.isEmpty() && amount > 0 && amount <= ballance){
            ballance -= amount;
            return true;
        }
        return false;
    }
}
