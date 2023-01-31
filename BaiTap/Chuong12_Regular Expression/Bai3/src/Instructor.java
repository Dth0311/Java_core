import javax.crypto.Mac;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Instructor {
    private String instructorId;
    private String fullName;
    private String major;
    private float salary;
    private float experience;

    public Instructor() {
    }

    public Instructor(String instructorId) {
        this.instructorId = instructorId;
    }

    public Instructor(String instructorId, String fullName, String major, float salary, float experience) {
        this.instructorId = instructorId;
        this.fullName = fullName;
        this.major = major;
        this.salary = salary;
        this.experience = experience;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) throws InvalidSalaryException {
        var regex = "(([0-7]?\\d?).\\d{1,2})|(80.[0]{1,2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(salary + "");
        if (matcher.matches()){
            this.salary = salary;
        }else {
            this.salary = 0;
            var msg = "Mức lương không hợp lệ: " + salary;
            throw new InvalidSalaryException(msg,salary);
        }
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
