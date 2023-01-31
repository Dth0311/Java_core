package Ex3;

public class Instructor {
    private String id;
    private String fullName;
    private String major;
    private long salary;
    private float experience;

    public Instructor() {
    }

    public Instructor(String id) {
        this.id = id;
    }

    public Instructor(String id, String fullName, String major,
                      long salary, float experience) {
        this.id = id;
        this.fullName = fullName;
        this.major = major;
        this.salary = salary;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) throws  InvalidSalaryException{
       if (salary >=0 && salary <= 50000){
           this.salary = salary;
       }else {
           this.salary =0;
           var msg = "Mức lương không hợp lệ " + salary
           + ", giá trị hợp lệ phải nằm trong đoạn [0,50000]";
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
