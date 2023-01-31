package Ex3;

import java.util.Date;

public class Instructor extends Person {
    private String instructorId;
    private String expertise; // chuyên môn
    private float salary;
    private float experience; // số năm kinh nghiệm

    public Instructor() {
    }

    public Instructor(String instructorId, String fullName, float salary, float experience) {
        setFullName(fullName);
        this.instructorId = instructorId;
        this.salary = salary;
        this.experience = experience;
    }

    public Instructor(String id, String fullName, String address, Date dateOfBirth, String email,
                      String phoneNumber, String instructorId, String expertise, float salary,
                      float experience) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber);
        this.instructorId = instructorId;
        this.expertise = expertise;
        this.salary = salary;
        this.experience = experience;
    }

    // chấm bài
    public void mark(String subject) {
        System.out.println("Giảng viên đang chấm bài môn " + subject);
    }

    // soạn bài
    public void prepareLesson(String subject) {
        System.out.println("Giảng viên đang soạn bài môn " + subject);
    }

    // tham gia họp
    public void joinMeeting() {
        System.out.println("Giảng viên đang họp");
    }

    // ra đề thi
    public void createExam(String subject) {
        System.out.println("Giảng viên đang ra đề thì môn " + subject);
    }


    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Giảng viên đang ăn trưa");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Giảng viên đang ngủ nướng");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Giảng viên đang nói chuyện với các đồng nghiệp");
    }

    @Override
    public void relax(String thing) {
        super.relax(thing);
        System.out.println("Giảng viên đang relax giữa trưa");
    }

    public final String getInstructorId() {
        return instructorId;
    }

    public final void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public final String getExpertise() {
        return expertise;
    }

    public final void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public final float getSalary() {
        return salary;
    }

    public final void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
