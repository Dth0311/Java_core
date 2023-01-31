public class Employee {
    public String id;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public float salary;
    public int experience;

    public void work(String job) {
        System.out.println(fullName + " đang làm nhiệm vụ " + job);
    }

    // phương thức thể hiện hành động nghỉ ngơi
    public void relax() {
        System.out.println(fullName + " đang nghỉ ngơi.");
    }

    // phương thức thể hiện hành động nhận lương
    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(fullName + " đã nhận lương tháng là " + salary + "đ");
    }

    // phương thức thể hiện hành động đi du lịch
    public void travel(String someWhere) {
        System.out.println(fullName + " đang vi vu ở " + someWhere);
    }
}
