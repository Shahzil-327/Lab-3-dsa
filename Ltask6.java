import java.util.Scanner;

public class Ltask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(countDigits(number));
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigits(number / 10);
    }
}
