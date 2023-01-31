import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot chuoi ky tu:");
        var str = scanner.nextLine();
        var words = str.split("\\s+");
        System.out.println("Cac tu truoc khi sap xep:");
        showWords(words);
        System.out.println("Cac tu sau khi sap xep:");
        sort(words);
        showWords(words);
    }

    private static void sort(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = words.length - 1; j > i; j--) {
                if (words[j].compareTo(words[j - 1]) > 0) {
                    var tg = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = tg;
                }
            }
        }
    }

    private static void showWords(String[] words) {
        for (var word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
