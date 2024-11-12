import java.util.Scanner;

public class Ltask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scanner.nextInt();
        System.out.println(sum(N));
    }

    public static int sum(int N) {
        if (N == 1) {
            return 1;
        }
        return N + sum(N - 1);
    }
}
