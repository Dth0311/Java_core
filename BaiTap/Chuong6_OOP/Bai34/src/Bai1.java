import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=========MENU==========");
            System.out.println("1. Them mot nhan vien");
            System.out.println("2. Hien thi thong tin nhan vien");
            System.out.println("3. Tim nhan vien theo ten");
            System.out.println("4. Xoa nhan vien theo ma cho truoc");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("Moi ban nhap lua chon:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("==> CAM ON BAN DA SU DUNG DICH VU <==");
                    break;
                case 1:
                    var emp = creatNewEmployee(scanner);
                    employees.add(emp);
                    break;
                case 2:
                    showEmployees(employees);
                    break;
                case 3:
                    if (employees.size() > 0){
                        var name = "";
                        System.out.println("Nhap ten can tim:");
                        name = scanner.nextLine();
                        var result = searchByName(employees,name);
                        if (result.size() > 0){
                            System.out.println("==> Tim thay " + result.size() + " ket qua");
                            showEmployees(result);
                        }
                        else {
                            System.out.println("==> Khong tim thay tin nhan vien nao");
                        }
                    }
                    else {
                        System.out.println("Danh sach nhan vien rong");
                    }
                    break;
                case 4:
                    if (employees.size() > 0){
                        System.out.println("Nhap ma nhan vien can xoa:");
                        var id = scanner.nextLine();
                        var isDeleted = removeEmp(employees, id);
                        if (isDeleted){
                            System.out.println("==> Xoa thanh cong <==");
                        }else {
                            System.out.println("==> Khong tim thay ma nhan vien <==");
                        }
                    }
                    else {
                        System.out.println("Danh sach nhan vien rong");
                    }
                    break;
                default:
                    System.out.println("==> Sai chuc nang, vui long nhap lai!");
                    break;
            }
        }while (choice !=0);
    }

    private static boolean removeEmp(ArrayList<Employee> employees, String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().compareToIgnoreCase(id)==0){
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    private static ArrayList<Employee> searchByName(ArrayList<Employee> employees, String name) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp:employees) {
            var firstName = getFirstName(emp.getFullName());
            if (firstName.compareToIgnoreCase(name) ==0){
                res.add(emp);
            }
        }
        return res;
    }

    private static String getFirstName(String fullName) {
        int index = fullName.lastIndexOf(" ");
        return fullName.substring(index + 1);
    }

    private static void showEmployees(ArrayList<Employee> employees) {
        if (employees.size() > 0){
            System.out.println("==> DANH SACH SINH VIEN <==");
            System.out.printf("%-12s%-25s%-15s%-10s%-15s%-15s%-15s\n"
            ,"Ma NV","Ten Nv", "Dia chi","Tuoi", "So DT", "Luong", "Kinh nghiem");
            for (var emp:employees) {
                showEmp(emp);
            }
        }
        else {
            System.out.println("==> DANH SACH NHAN VIEN RONG <==");
        }
    }

    private static void showEmp(Employee emp) {
        System.out.printf("%-12s%-25s%-15s%-10s%-15s%-15s%-15s\n"
                ,emp.getId(),emp.getFullName(), emp.getAddress(),
                emp.getAge(), emp.getPhoneNumber(),emp.getSalary()
                ,emp.getExperience());
    }

    private static Employee creatNewEmployee(Scanner scanner) {
        System.out.println("Nhap ma nhan vien:");
        var id = scanner.nextLine();
        System.out.println("Nhap ten nhan vien:");
        var name = scanner.nextLine();
        System.out.println("Dia chi:");
        var address = scanner.nextLine();
        System.out.println("So dien thoai:");
        var phoneNumber = scanner.nextLine();
        System.out.println("Tuoi:");
        var age = scanner.nextInt();
        System.out.println("Muc luong:");
        var salary = scanner.nextFloat();
        System.out.println("So nam kinh nghiem:");
        var exp = scanner.nextInt();
        Employee employee = new Employee(id,name,address,age,phoneNumber
                ,salary,exp);
        return employee;
    }
}
