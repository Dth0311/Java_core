package Ex5;

import java.util.Date;
import java.util.TreeMap;

public class Employee extends Person{
    private static int nextId = 1001;
    private String empId;
    private String duty;
    private float salary;
    private float experience;
    private float workingDay;
    private float totalSalary; // tổng lương
    private float bonus;

    public Employee() {
    }

    public Employee(String empId, String duty, float salary, float experience,
                    float workingDay, float totalSalary, float bonus) {
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
        this.workingDay = workingDay;
        this.totalSalary = totalSalary;
        this.bonus = bonus;
    }

    public Employee(String id, String fullName, String address, Date dateOfBirth,
                    String email, String phoneNumber, String empId, String duty,
                    float salary, float experience, float workingDay, float totalSalary, float bonus) {
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

    @Override
    public void work() {
        System.out.println(getFullNameString()
                + " đang làm công việc của một " + duty);
    }

    public void calculTotalSalary(){
            totalSalary = workingDay * salary / 22;

    }

    public void calculBonus(){
        if (workingDay > 20){
            var bonusDay = workingDay - 20;
            bonus = bonusDay * 0.5f * salary / 22;
        }else {
            bonus = 0;
        }
    }

    public void receiveSalary(){
        System.out.println("Mức lương chuyển khoản cho nhân viên " + getFullNameString()
        + " : " + totalSalary );
    }

    public String receiBonus(){
        return "Nhận tiền mặt";
    }

    public void travel(){
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

    public final String getDuty() {
        return duty;
    }

    public final void setDuty(String duty) {
        this.duty = duty;
    }

    public final float getSalary() {
        return salary;
    }

    public final void setSalary(float salary) {
        this.salary = salary;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }

    public final float getWorkingDay() {
        return workingDay;
    }

    public final void setWorkingDay(float workingDay) {
        this.workingDay = workingDay;
    }

    public final float getTotalSalary() {
        return totalSalary;
    }

    public final void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
