public class Bai5 {
    public static void main(String[] args) {
        System.out.println("So cac chu so:" + countNumbers(345345));
    }

    private static int countNumbers(int n) {
        if (n<10){
            return 1;
        }
        else {
            return 1 + countNumbers(n/10);
        }
    }
}
