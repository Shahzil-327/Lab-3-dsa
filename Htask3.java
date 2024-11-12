import java.util.Scanner;

public class Htask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println(gcd(num1, num2));
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
