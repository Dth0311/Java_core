package Bai1;

public class InvalidExceptionAge extends Exception {
    private int invalidAge;

    public InvalidExceptionAge() {
    }

    public InvalidExceptionAge(int invalidAge) {
        this.invalidAge = invalidAge;
    }
    public InvalidExceptionAge(String message,int invalidAge){
        super(message);
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
