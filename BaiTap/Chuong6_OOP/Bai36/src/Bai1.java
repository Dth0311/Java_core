import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input1.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var numbers = getNumbers(n,input);
        input.close();
        System.out.println("Mảng trước khi sắp xếp: ");
        showArray(numbers);
        // sắp xếp và hiện thị
        Arrays.sort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
    }

    private static void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
