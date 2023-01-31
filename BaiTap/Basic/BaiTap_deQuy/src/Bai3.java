public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Sum=" + add(423));
    }

    private static long add(int n) {
        if (n<10){
            return n;
        }
        else {
            return n%10 + add(n/10);
        }
    }
}
