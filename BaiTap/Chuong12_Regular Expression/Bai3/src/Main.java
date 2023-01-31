import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập lương:");
        var Salary = input.nextFloat();
        var regex = "([0-7]?[0-9]?).[0-9]{1,2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Salary + "");
            if (matcher.matches()){
                System.out.println("Lương " + Salary);
            }else {
                System.out.println("Nhập lại đi ku!");
            }
    }
}
