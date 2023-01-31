package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự bất kì: ");
        var str = input.nextLine();
        List<WordCounting> words = count(str);
        showResult(words);
    }

    private static void showResult(List<WordCounting> words) {
        System.out.printf("%-20s%-10s\n", "Từ", "Tần suất");
        for (var e : words) {
            System.out.printf("%-20s%-10d\n", e.getWord(), (int) e.getOccurrence());
        }
    }

    private static List<WordCounting> count(String str) {
        String[] words = str.split("\\s+"); // tách tại vị trí 1 hoặc nhiều dấu cách
        List<WordCounting> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            WordCounting element = new WordCounting(words[i], 1);
            if (result.contains(element)) {
                var current = getWord(result, words[i]);
                current.setOccurrence((int) current.getOccurrence() + 1);
            } else {
                result.add(element);
            }
        }
        return result;
    }

    private static WordCounting getWord(List<WordCounting> result, String word) {
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getWord().equals(word)) {
                return result.get(i);
            }
        }
        return null;
    }
}
