package JavaCodingChallenge;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("racecar")); // Should print true
        System.out.println(isPalindrome("10801"));   // Should print true
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the original string with its reverse
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
}
