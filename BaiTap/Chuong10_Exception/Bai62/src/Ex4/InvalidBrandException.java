package Ex4;

public class InvalidBrandException extends Exception {
    private String invalidBrand;

    public InvalidBrandException() {
    }

    public InvalidBrandException(String invalidBrand) {
        this.invalidBrand = invalidBrand;
    }

    public InvalidBrandException(String msg, String invalidBrand) {
        super(msg);
        this.invalidBrand = invalidBrand;
    }

    public String getInvalidBrand() {
        return invalidBrand;
    }
}
