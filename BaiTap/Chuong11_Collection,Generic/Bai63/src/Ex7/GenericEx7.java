package Ex7;

public class GenericEx7 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 6, 5, 2, 4, 7, 8};
        Double[] interestRate = {0.25, 1.5, 6.35, 4.75, 5.5, 5.5, 5.5};
        System.out.println("Tổng chữ số trong mảng numbers: " + sumNumbers(numbers));
        System.out.println("Tổng chữ số trong mảng interestRate: " + sumNumbers(interestRate));
    }
    public static <T extends Number> double sumNumbers(T[] arr){
        double sum = 0;
        for (var e:arr
             ) {
            sum+=e.doubleValue();
        }
        return sum;
    }
}
