import java.util.Scanner;

public class Taxi_Meter_Calculator {
    public static void main(String[] args) {
        // Variables
        double kmRate = 2.20; // Fare per kilometer
        double baseFare = 10.00; // Taxi meter base fare
        double minimumFare = 20.00; // minimum fare

        // Get distance from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled (in kilometers):");
        double distance = scanner.nextDouble();

        // Calculate total fare
        double totalFare = baseFare + (distance * kmRate);

        // Check for minimim fare
        if (totalFare < minimumFare) {
            totalFare = minimumFare;
        }
        // Display the result
        System.out.println("Total taxi fare:" + totalFare + "TL");
    }

}