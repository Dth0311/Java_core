public class Employee {
    private String id;
    private String fullName;
    private String address;
    private int age;
    private String phoneNumber;
    private float salary;
    private int experience;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Employee(String id, String fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public Employee(String id, String fullName, String address, int age) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber, float salary) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber, float salary, int experience) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.experience = experience;
    }

    public void work(String job) {
        System.out.println(fullName + " đang làm nhiệm vụ " + job);
    }

    public void relax() {
        System.out.println(fullName + " dang nghi ngoi");
    }

    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(fullName + " da nhan so luong:" + salary);
    }

    public void travel(String someWhere) {
        System.out.println(fullName + " dang di du lich o " + someWhere);
    }
}
