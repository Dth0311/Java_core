public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Chu so dau tien:" + firstNumber(543));
    }

    private static int firstNumber(int n) {
        if (n<10){
            return n;
        }
        else {
            return firstNumber(n/10);
        }
    }
}
