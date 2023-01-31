import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng mộn học:");
        var n = scanner.nextInt();
        scanner.nextLine();
        if(n>0){
            Subject[] subjects = new Subject[n];
            fillSubjectInfor(subjects,scanner);
            showSubjects(subjects);
        }else {
            System.out.println("Số lượng môn học phải là số dương");
        }
    }

    private static void showSubjects(Subject[] subjects) {
        sort(subjects);
        System.out.println("===========THÔNG TIN MÔN HỌC=========");
        System.out.printf("%-15s%-20s%-15s%-15s%-15s\n",
                "Mã môn học", "Tên môn", "Tín chỉ", "Số tiết", "Số bài kt");
        for (var sub:subjects) {
            sub. showInfoLine();
        }
    }

    private static void sort(Subject[] subjects) {
        for (int i = 0; i < subjects.length-1; i++) {
            for (int j = subjects.length-1; j >i ; j--) {
                if(subjects[j].getNumOfLesson() < subjects[j-1].getNumOfLesson()){
                    Subject tg = subjects[j];
                    subjects[j] = subjects[j-1];
                    subjects[j-1] = tg;
                }
            }
        }
    }

    private static void fillSubjectInfor(Subject[] subjects, Scanner scanner) {
        for (int i = 0; i < subjects.length; i++) {
            Subject subject = new Subject();
            System.out.println("Nhập thông tin môn học thứ " + (i+1) + ":");
            System.out.print("Mã môn học:");
            subject.setId(scanner.nextLine());
            System.out.print("Tên môn học: ");
            subject.setName(scanner.nextLine());
            System.out.print("Số tín chỉ: ");
            subject.setCredit(scanner.nextInt());
            System.out.print("Số tiết học: ");
            subject.setNumOfLesson(scanner.nextInt());
            System.out.print("Số bài kiểm tra: ");
            subject.setNumOfTest(scanner.nextInt());
            scanner.nextLine(); // đọc bỏ kí tự thừa

            subjects[i] = subject;
        }
    }
}
