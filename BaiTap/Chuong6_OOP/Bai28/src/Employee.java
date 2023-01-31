public class Employee {
    public String id;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public float salary;
    public float experience;

    public Employee() {
        id = "";
        fullName = "";
        address = "";
        age = 0;
        phoneNumber = "";
        salary = 0;
        experience = 0;
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String fullName) {
        this(id);
        this.fullName = fullName;
    }

    public Employee(String id, String fullName, String address) {
        this(id,fullName);
        this.address = address;
    }

    public Employee(String id, String fullName, String address, int age) {
        this(id,fullName,address);
        this.age = age;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber) {
        this(id,fullName,address,age);
        this.phoneNumber = phoneNumber;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber, float salary) {
        this(id,fullName,address,age,phoneNumber);
        this.salary = salary;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber, float salary, float experience) {
        this(id,fullName,address,age,phoneNumber,salary);
        this.experience = experience;
    }

    public void work(String job) {
        System.out.println(fullName + " dang lam nhiem vu " + job);
    }

    public void relax() {
        System.out.println(fullName + " dang nghi ngoi");
    }

    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(fullName + " da nhan luong thang la " + salary + "d");
    }

    public void travel(String someWhere) {
        System.out.println(fullName + " dang vi vu o " + someWhere);
    }
}
