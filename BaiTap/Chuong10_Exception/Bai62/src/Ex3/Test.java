package Ex3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập họ và tên của giảng viên:");
        var fullName = input.nextLine();
        System.out.println("Nhập mức lương: ");
        var salaryStr = input.nextLine().trim();
        Instructor instructor = new Instructor();
        instructor.setFullName(fullName);

        var salary = Long.parseLong(salaryStr);
        try {
            instructor.setSalary(salary);
            System.out.println("Thiết lập mức lương thành công");
        } catch (InvalidSalaryException e) {
            e.printStackTrace();
            System.out.println("Thiết lập mức lương thất bại");
        }
        showInfor(instructor);
    }

    private static void showInfor(Instructor instructor) {
        System.out.println("=============================");
        System.out.println("Tên giảng viên: " + instructor.getFullName());
        System.out.println("Mức lương:" + instructor.getSalary());
    }
}
