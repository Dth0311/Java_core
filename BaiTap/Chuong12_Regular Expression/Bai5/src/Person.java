import exceptions.InvalidEmailException;
import exceptions.InvalidNameException;
import exceptions.InvalidPhoneNumberException;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person implements Comparable<Person> {
    private String id;
    private FullName fullName;
    private String address;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String id, String fullName, String address,
                  Date dateOfBirth, String email, String phoneNumber) throws InvalidNameException {
        this.id = id;
        this.setFullName(fullName);
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        return id.compareTo(o.id);
    }

    public void eat(String food) {
        System.out.println("Người đang ăn " + food);
    }

    public void sleep() {
        System.out.println("Người đang ngủ");
    }

    public void speak() {
        System.out.println("Người đang nói chuyện");
    }

    public void relax(String thing) {
        System.out.println("Người đang giải trí bằng " + thing);
    }

    protected abstract void work();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullNameString() {
        return fullName.last + " " + fullName.mid + " " + fullName.first;
    }

    public final FullName getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) throws InvalidNameException {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() >0){
            var regex = "^([a-zA-Z]+\\s?){2,30}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(fullName);
            if (!matcher.matches()){
                var msg = "Họ tên không hợp lệ " + fullName;
                throw new InvalidNameException(msg,fullName);
            }
            var words = fullName.split("\\s+"); // tách tại vị trí có dấu cách
            this.fullName.first = words[words.length - 1];
            this.fullName.mid = "";
            this.fullName.last = words[0];
            for (int i = 1; i < words.length -1; i++) {
                this.fullName.mid += words[i] + " ";
            }
        }
    }
    /**
     * Phương thức kiểm tra xem họ và tên có hợp lệ không
     * Hẹ tên hợp lệ nếu chỉ chứa kí tự chữ cái và dẫu cách*/
    protected boolean checkFullNameValid(String fullName){
        //Những kí tự không hợp lệ trong tên
        String checker = "0123456789+-/=]}[{'\\\";:/?.>,<)(&^%$#@!~`\\\\|";
        for (int i = 0; i < fullName.length(); i++) {
            for (int j = 0; j < checker.length(); j++) {
                if (fullName.charAt(i) == checker.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        var regex = "^[a-z]+[a-z0-9._]*@gmail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            this.email = email;
        }else {
            var msg = "Email không hợp lệ " + email;
            throw new InvalidEmailException(msg,email);
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        var regex = "^((08|09)\\d{7})|((03|04|07)\\d{8})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()){
            this.phoneNumber = phoneNumber;
        }else {
            var msg = "Số điện thoại không hợp lệ " + phoneNumber;
            throw new InvalidPhoneNumberException(msg,phoneNumber);
        }
    }

    private class FullName {
        private String first;
        private String mid;
        private String last;

        public FullName() {
        }

        public FullName(String first, String mid, String last) {
            this.first = first;
            this.mid = mid;
            this.last = last;
        }

        public final String getFirst() {
            return first;
        }

        public final void setFirst(String first) {
            this.first = first;
        }

        public final String getMid() {
            return mid;
        }

        public final void setMid(String mid) {
            this.mid = mid;
        }

        public final String getLast() {
            return last;
        }

        public final void setLast(String last) {
            this.last = last;
        }
    }
}
