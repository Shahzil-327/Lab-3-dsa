import java.util.Scanner;

public class Ltask1 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = k; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}