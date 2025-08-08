import java.util.Scanner;

public class OddSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        // Calculate number of odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;

        // Generate and print the series
        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
