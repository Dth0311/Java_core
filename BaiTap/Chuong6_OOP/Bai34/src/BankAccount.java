public class BankAccount {
    private String id;
    private String accNumber;
    private String owner;
    private String type;
    private long ballance;
    private String bankName;
    private String startDate;
    private String endDate;

    public BankAccount() {
        id = "";
        accNumber = "";
        owner = "";
        type = "";
        ballance = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    public BankAccount(String id) {
        this.id = id;
    }

    public BankAccount(String id, String accNumber) {
        this.id = id;
        this.accNumber = accNumber;
    }

    public BankAccount(String id, String accNumber, String owner) {
        this.id = id;
        this.accNumber = accNumber;
        this.owner = owner;
    }

    public BankAccount(String id, String accNumber, String owner, String type) {
        this.id = id;
        this.accNumber = accNumber;
        this.owner = owner;
        this.type = type;
    }

    public BankAccount(String id, String accNumber, String owner, String type, long ballance) {
        this.id = id;
        this.accNumber = accNumber;
        this.owner = owner;
        this.type = type;
        this.ballance = ballance;
    }

    public BankAccount(String id, String accNumber, String owner, String type, long ballance, String bankName) {
        this.id = id;
        this.accNumber = accNumber;
        this.owner = owner;
        this.type = type;
        this.ballance = ballance;
        this.bankName = bankName;
    }

    public BankAccount(String id, String accNumber, String owner, String type, long ballance, String bankName, String startDate) {
        this.id = id;
        this.accNumber = accNumber;
        this.owner = owner;
        this.type = type;
        this.ballance = ballance;
        this.bankName = bankName;
        this.startDate = startDate;
    }

    public BankAccount(String id, String accNumber, String owner, String type, long ballance, String bankName, String startDate, String endDate) {
        this.id = id;
        this.accNumber = accNumber;
        this.owner = owner;
        this.type = type;
        this.ballance = ballance;
        this.bankName = bankName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    // nap tien vao tai khoan
    public boolean deposit(long amount){
        if (amount > 0){
            ballance += amount;
            return true;
        }
        return false;
    }

    // rut tien
    public boolean withdraw(long amount){
        if (amount > 0 && amount <= ballance){
            ballance -= amount;
            return true;
        }
        return false;
    }

    // chuyen khoan tu tai khoan nay sang tai khoan khacs
    public boolean bankTransfer(BankAccount other, long amount){
        if (amount > 0 && amount <= ballance){
            ballance -= amount;
            other.ballance += amount;
            return true;
        }
        return false;
    }

    // kiem tra so du tai khoan
    public void checkAccBallence(){
        System.out.println("So du hien tai cua ban la:" + ballance);
    }

    // thanh toan cacs dich vu khac
    public boolean pay(String service,long amount){
        if (!service.isEmpty() && amount > 0 && amount < ballance){
            ballance -= amount;
            return true;
        }
        return false;
    }
}
