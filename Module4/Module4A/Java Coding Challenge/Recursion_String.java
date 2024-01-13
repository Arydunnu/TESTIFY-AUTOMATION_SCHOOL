package JavaCodingChallenge;

public class Recursion_String {

    public static void main(String[] args) {
        String input = "Testify Automation";
        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    // Function to reverse a string using recursion
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive step: reverse the substring excluding the first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
