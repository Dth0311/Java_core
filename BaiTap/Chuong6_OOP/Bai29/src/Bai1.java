public class Bai1 {
    public static void main(String[] args) {
        Employee hai = new Employee();
        var fullName = "Đặng Thanh Hải";
        hai.setFullName(fullName);
        System.out.println("Hello " + hai.getFullName());
        hai.relax();
        hai.receiveSalary(1000);
    }
}
