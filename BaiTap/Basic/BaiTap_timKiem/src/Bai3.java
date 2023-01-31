import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        var n = scanner.nextInt();
        var numbers = getNumbers(n,scanner);
        System.out.print("x:");
        var x = scanner.nextInt();
        System.out.println("a=");
        var a = scanner.nextInt();
        System.out.println("b=");
        var b = scanner.nextInt();
        int count = linearSearch(numbers,x,a,b);
        var result = count == -1 ? "Khong ton tai x" :
                "x xuat hien " + count + " lan";
        System.out.println(result);
    }

    private static int linearSearch(int[] numbers, int x, int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
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
