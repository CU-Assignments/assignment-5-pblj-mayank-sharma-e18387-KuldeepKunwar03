import java.util.ArrayList;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read input from the user
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        // Convert string inputs to Integer objects using Autoboxing
        for (String numStr : inputArray) {
            numbers.add(Integer.parseInt(numStr)); // Autoboxing
        }

        // Compute sum using Unboxing
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }

        // Display the result
        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}
