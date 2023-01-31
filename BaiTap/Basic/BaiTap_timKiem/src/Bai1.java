import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        System.out.print("x:");
        var x = scanner.nextInt();
        int index = linearSearch(numbers,x);
        var result = index == -1 ? "Khong ton tai x" :
                "Tim thay x tai vi tri " + index;
        System.out.println(result);
    }

    private static int linearSearch(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== x){
                return i;
            }
        }
        return -1;
    }

    private static int[] getNumbers(int n, Scanner scanner) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
