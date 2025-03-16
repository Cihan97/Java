import java.util.Scanner;

public class GradeAverageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get grades from the user
        System.out.print("Enter your Mathematics grade: ");
        double math = input.nextDouble();

        System.out.print("Enter your Physics grade: ");
        double physics = input.nextDouble();

        System.out.print("Enter your Chemistry grade: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter your Biology grade: ");
        double biology = input.nextDouble();

        System.out.print("Enter your Computer Science grade: ");
        double computerScience = input.nextDouble();

        // Calculate the average
        double average = (math + physics + chemistry + biology + computerScience) / 5;

        // Determine result
        String result = (average >= 60) ? "Passed 🎉" : "Failed ❌";

        // Print the result
        System.out.println("\nYour average is: " + average);
        System.out.println("Final Result: " + result);

        // Close scanner
        input.close();
    }
}
