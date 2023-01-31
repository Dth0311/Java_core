public class InvalidBrandNameException extends Exception {
    private String invalidBrandName;

    public InvalidBrandNameException() {
    }

    public InvalidBrandNameException(String invalidBrandName) {
        this.invalidBrandName = invalidBrandName;
    }

    public InvalidBrandNameException(String msg, String invalidBrandName) {
        super(msg);
        this.invalidBrandName = invalidBrandName;
    }

    public String getInvalidBrandName() {
        return invalidBrandName;
    }
}
