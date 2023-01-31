public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Dao nguoc chu so:");
        printRevert(20);
    }

    private static void printRevert(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            printRevert(n / 10);
        }
    }
}
