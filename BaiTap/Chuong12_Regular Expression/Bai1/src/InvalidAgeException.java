public class InvalidAgeException extends Exception {
    private int invalidAge;

    public InvalidAgeException() {
    }

    public InvalidAgeException(int invalidAge) {
        this.invalidAge = invalidAge;
    }

    public InvalidAgeException(String msg, int invalidAge) {
        super(msg);
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
