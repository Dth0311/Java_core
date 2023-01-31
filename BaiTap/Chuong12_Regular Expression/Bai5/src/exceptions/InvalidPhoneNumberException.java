package exceptions;

public class InvalidPhoneNumberException extends Exception{
    private String invalidPhone;

    public InvalidPhoneNumberException() {
    }

    public InvalidPhoneNumberException(String invalidPhone) {
        this.invalidPhone = invalidPhone;
    }

    public InvalidPhoneNumberException(String msg,String invalidPhone){
        super(msg);
        this.invalidPhone = invalidPhone;
    }

    public String getInvalidPhone() {
        return invalidPhone;
    }

    public void setInvalidPhone(String invalidPhone) {
        this.invalidPhone = invalidPhone;
    }
}
