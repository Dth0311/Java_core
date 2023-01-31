public class Bai1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("EMP001");
        Employee employee3 = new Employee("EMP001", "Trương Hoàng Anh");
        Employee employee4 = new Employee("EMP001",
                "Trương Hoàng Anh", "Hà Nội");
        Employee employee5 = new Employee("EMP001", "Trương Hoàng Anh",
                "Hà Nội", 22);
        Employee employee6 = new Employee("EMP001", "Trương Hoàng Anh",
                "Hà Nội", 22, "098277688");
        Employee employee7 = new Employee("EMP001", "Trương Hoàng Anh",
                "Hà Nội", 22, "098277688", 31000000);
    }
}
