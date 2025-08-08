import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        // Generate and print the series
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
