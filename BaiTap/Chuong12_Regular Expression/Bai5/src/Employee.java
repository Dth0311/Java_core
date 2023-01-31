import javax.sound.midi.MidiFileFormat;
import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String empId;
    private String duty;
    private float salary;
    private float experience;
    private float workingDay;
    private float totalSalary;
    private float bonus;

    public Employee() {
    }

    public Employee(String empId, String duty, float salary, float experience,
                    float workingDay, float totalSalary, float bonus) {
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
        this.setWorkingDay(workingDay);
        this.totalSalary = totalSalary;
        this.bonus = bonus;
    }

    public Employee(String id, String fullName, String address, Date dateOfBirth, String email, String phoneNumber, String empId, String duty, float salary, float experience, float workingDay, float totalSalary, float bonus) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber);
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
        this.workingDay = workingDay;
        this.totalSalary = totalSalary;
        this.bonus = bonus;
    }

    @Override
    protected void work() {
        System.out.println(getFullNameString()
                + " đang làm công việc của một " + duty);
    }

    @Override
    public void eat(String food) {
        System.out.println("Nhân viên " + getFullNameString()
                + " đang ăn " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Nhân viên " + getFullNameString() + " đang ngủ");
    }

    @Override
    public void speak() {
        System.out.println("Nhân viên " + getFullNameString()
                + " đang nói chuyện");
    }

    @Override
    public void relax(String thing) {
        System.out.println("Nhân viên " + getFullNameString()
                + " đang giải trí bằng " + thing);
    }

    public void calculTotalSalary(){
        totalSalary = workingDay * salary /22 + bonus;
    }

    public void calculBonus(){
        if (workingDay >= 20){
            var bonusDay = workingDay - 20;
            bonus = bonusDay * 0.5f * salary / 22;
        }else {
            bonus = 0;
        }
    }

    public void receiveSalary() { // nhận lương
        System.out.println("Mức lương chuyển khoản của nhân viên "
                + getFullNameString() + ": " + totalSalary);
    }

    public String receiBonus() {
        return "Nhận tiền mặt";
    }

    public void travel() {
        System.out.println("Nhân viên " + getFullNameString() + " đang đi du lịch");
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        if (empId == null){
            this.empId = "EMP" + nextId;
            nextId++;
        }else {
            this.empId = empId;
        }
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public float getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(float workingDay) {
        this.workingDay = workingDay;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
