import java.util.Scanner;

public class Grade_Average_Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get grades from the user
        System.out.println("Enter Mathematics grade: ");
        double Math = input.nextDouble(); // Use 'input' here instead of 'scanner'

        System.out.println("Enter the Physics grade: ");
        double Physics = input.nextDouble(); // Use 'input' here instead of 'scanner'

        System.out.println("Enter the Chemistry grade:");
        double Chemistry = input.nextDouble(); // Use 'input' here instead of 'scanner'

        System.out.println("Enter the Biology grade:");
        double Biology = input.nextDouble(); // Use 'input' here instead of 'scanner'

        System.out.println("Enter the Computer Science grade:");
        double Computer_Science = input.nextDouble(); // Use 'input' here instead of 'scanner'

        // Calculate the average
        double average = (Math + Physics + Chemistry + Biology + Computer_Science) / 5;

        // Use the ternary operator for conditional check
        String result = (average >= 60) ? "Passed" : "Failed";

        // Print the result
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}
