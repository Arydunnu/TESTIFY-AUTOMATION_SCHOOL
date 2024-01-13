package JavaClass;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

                // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a word
                System.out.print("Enter a word: ");

                // Keep looping until the user enters "testify"
                while (true) {
                    // Read the user's input
                    String userInput = scanner.nextLine();

                    // Check if the input is "testify"
                    if (userInput.equalsIgnoreCase("testify")) {
                        System.out.println("Congratulations! You entered 'testify'.");
                        break; // Exit the loop
                    } else {
                        System.out.println("Try again.");
                        System.out.print("Enter a word: ");
                    }
                }

                // Close the Scanner to prevent resource leak
                scanner.close();
            }
        }
