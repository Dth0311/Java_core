package Ex2;

public class InvalidAmountException extends Exception {
    private long invalidAmount;

    public InvalidAmountException() {
    }

    public InvalidAmountException(long invalidAmount) {
        this.invalidAmount = invalidAmount;
    }

    public InvalidAmountException(String msg, long invalidAmount){
        super(msg);
        this.invalidAmount = invalidAmount;
    }
    public long getInvalidAmount() {
        return invalidAmount;
    }
}
