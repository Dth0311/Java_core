package Ex3;

public class Student {
     private String id;
     private FullName fullName;
     private String address;
     private String email;
     private String gender;
     private String className;
     private String major;
     private String phoneNumber;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, FullName fullName, String address, String email,
                   String gender, String className, String major,
                   String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.className = className;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName.last + " " + fullName.mid + " "+ fullName.last;
    }

    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.last = words[0];
        this.fullName.first = words[words.length -1];
        this.fullName.mid = "";
        for (int i = 0; i < words.length -1; i++) {
            this.fullName.mid += words[i];
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    class FullName{
         private String first;
         private String last;
         private String mid;
     }
}
