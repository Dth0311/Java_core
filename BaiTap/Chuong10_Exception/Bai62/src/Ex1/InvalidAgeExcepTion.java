package Ex1;

public class InvalidAgeExcepTion extends Exception {
    private int invalidAge;

    public InvalidAgeExcepTion() {
    }

    public InvalidAgeExcepTion(int invalidAge) {
        this.invalidAge = invalidAge;
    }

    public InvalidAgeExcepTion(String msg, int invalidAge) {
        super(msg);
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
