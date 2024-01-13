package JavaClass;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get principal amount
        System.out.print("Enter the Capital: ");
        double Capital = scanner.nextDouble();

        // Get interest rate
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble();

        // Get time in years
        System.out.print("Enter the time in years: ");
        double duration = scanner.nextDouble();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate simple interest
        double simpleInterest = (Capital * interestRate * duration) / 100;

        // Communicate the simple interest back to the user
        System.out.println("Simple Interest Calculation:");
        System.out.println("Capital Amount: $" + Capital);
        System.out.println("Annual Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Duration (in years): " + duration);
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}
