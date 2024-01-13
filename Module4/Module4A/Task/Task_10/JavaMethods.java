package JavaClass;

import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {

                // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a message
                System.out.print("Enter your message: ");

                // Read the user's input
                String userInput = scanner.nextLine();

                // Invoke the method to verify training interest
                verifyTrainingInterest(userInput);

                // Close the Scanner to prevent resource leak
                scanner.close();
            }

            // Method to verify training interest
            public static void verifyTrainingInterest(String message) {
                if (message.equalsIgnoreCase("testify")) {
                    System.out.println("Welcome! Thanks for showing interest in Testify Trainings.");
                } else {
                // Check if the input contains the word "Testify"
                    System.out.println("Sorry, your message does not indicate interest in Testify Trainings. Rejected.");
                }
            }
        }
