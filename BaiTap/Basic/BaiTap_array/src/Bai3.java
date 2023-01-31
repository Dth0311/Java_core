import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n phan tu mang:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        var result = isRevert(numbers) ? "Mang doi xung" : "Mang k doi xung";
        System.out.println(result);
    }
    private static int[] getNumbers(int n,Scanner scanner){
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    private static boolean isRevert(int[] numbers){
        for (int i = 0; i <= numbers.length/2; i++) {
            if (numbers[i]!= numbers[numbers.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
