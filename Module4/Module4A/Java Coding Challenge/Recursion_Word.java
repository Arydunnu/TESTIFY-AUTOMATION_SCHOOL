package JavaCodingChallenge;

public class Recursion_Word {

    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    // Function to reverse the position of words in a sentence using recursion
    public static String reverseWords(String sentence) {
        // Base case: if the sentence is empty or has only one word
        if (!sentence.contains(" ")) {
            return sentence;
        }

        // Split the sentence into words
        String[] words = sentence.split("\\s", 2);

        // Recursively reverse the rest of the sentence and concatenate the current word
        return reverseWords(words[1]) + " " + words[0];
    }
}
