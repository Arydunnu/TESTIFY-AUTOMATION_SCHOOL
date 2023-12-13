package JavaClass;

public class StringOperations {
        public static void main(String[] args) {
            // Original string
            String originalString = "DEMOCRACY";

            // Reverse the string YCARCOMED
            String reversedString = new StringBuilder(originalString).reverse().toString();

            // Extract the word "COME"
            String extractedWord = reversedString.substring(4, 8);

            // Print the Extracted word
            System.out.println("Extracted Word: " + extractedWord);
        }
    }