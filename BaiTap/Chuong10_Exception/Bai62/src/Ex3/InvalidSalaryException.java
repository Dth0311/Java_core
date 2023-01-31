package Ex3;

public class InvalidSalaryException extends Exception {
    private float invalidSalary;

    public InvalidSalaryException() {
    }

    public InvalidSalaryException(float invalidSalary) {
        this.invalidSalary = invalidSalary;
    }

    public InvalidSalaryException(String msg, long invalidSalary) {
        super(msg);
        this.invalidSalary = invalidSalary;
    }

    public float getInvalidSalary() {
        return invalidSalary;
    }
}
