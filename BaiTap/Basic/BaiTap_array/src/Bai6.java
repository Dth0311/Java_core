import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguoi ban:");
        var n = scanner.nextInt();
        var friends = getFriend(n, scanner);
        result(friends);
    }

    private static String[] getFriend(int n, Scanner scanner) {
        var friends = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nguoi ban " + (i + 1) + ": ");
            friends[i] = scanner.next();
        }
        return friends;
    }

    private static long countName(String[] friends) {
        long min = friends[0].length();
        for (int i = 1; i < friends.length; i++) {
            if (friends[i].length() < min) {
                min = friends[i].length();
            }
        }
        return min;
    }

    private static void result(String[] friends) {
        long minFriend = countName(friends);
        for (var friend : friends) {
            if (friend.length() == minFriend) {
                System.out.print(friend + " ");
            }
        }
    }
}
