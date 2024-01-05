package ExceptionHandlingErrors;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class AgeNotName {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                System.out.println("Your age is: " + age);
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer for age.");
            } finally {
                scanner.close();
            }
        }
    }