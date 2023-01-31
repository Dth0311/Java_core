import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        System.out.print("x:");
        var x = scanner.nextInt();
        int count = linearSearch(numbers,x);
        var result = count == -1 ? "Khong ton tai x" :
                "x xuat hien " + count + " lan";
        System.out.println(result);
    }

    private static int linearSearch(int[] numbers, int x) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== x){
                count++;
            }
        }
       if (count!=0){
           return count;
       }
       else {
           return -1;
       }
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
