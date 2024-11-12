import java.util.Scanner;

public class Ltask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(sum(array, size - 1));
    }

    public static int sum(int[] array, int index) {
        if (index < 0) {
            return 0;
        }
        return array[index] + sum(array, index - 1);
    }
}

