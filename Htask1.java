import java.util.Scanner;
import java.util.HashMap;

public class Htask1 {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit for fibonacci series: ");
        int N = scanner.nextInt();
        System.out.println(fibonacci(N));
    }
    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = fibonacci(N - 1) + fibonacci(N - 2);
        memo.put(N, result);
        return result;
    }
}
