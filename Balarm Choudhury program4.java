import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input list
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        // Map to store counts of multiples for 1 through 9
        Map<Integer, Integer> multipleCounts = new LinkedHashMap<>();

        // Initialize map with keys 1 to 9 and values 0
        for (int i = 1; i <= 9; i++) {
            multipleCounts.put(i, 0);
        }

        // Count multiples
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multipleCounts.put(i, multipleCounts.get(i) + 1);
                }
            }
        }

        // Output the result
        System.out.println("Output:");
        System.out.println(multipleCounts);
    }
}
