import java.util.Scanner;

public class VAT_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the product price
        System.out.print("Enter the product price (USD): ");
        double basePrice = scanner.nextDouble();

        // Determine VAT rate based on price threshold
        double vatRate = (basePrice > 1000) ? 0.08 : 0.18;
        double vatAmount = basePrice * vatRate;
        double totalPrice = basePrice + vatAmount;

        // Display the calculated values
        System.out.printf("\nBase Price: %.2f USD\n", basePrice);
        System.out.printf("VAT Rate: %.0f%%\n", vatRate * 100);
        System.out.printf("VAT Amount: %.2f USD\n", vatAmount);
        System.out.printf("Total Price (including VAT): %.2f USD\n", totalPrice);

        scanner.close();
    }
}
