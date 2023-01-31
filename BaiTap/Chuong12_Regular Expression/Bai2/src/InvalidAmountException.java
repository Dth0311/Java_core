public class InvalidAmountException extends Exception {
    private long invalid;

    public InvalidAmountException() {
    }

    public InvalidAmountException(long invalid) {
        this.invalid = invalid;
    }

    public InvalidAmountException(String msg, long invalid) {
        super(msg);
        this.invalid = invalid;
    }

    public long getInvalid() {
        return invalid;
    }
}
