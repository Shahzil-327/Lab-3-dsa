import java.util.Scanner;

public class Htask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scanner.nextLine();
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}
