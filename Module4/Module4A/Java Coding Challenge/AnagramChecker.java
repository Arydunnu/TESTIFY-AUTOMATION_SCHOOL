package JavaCodingChallenge;

import java.util.Arrays;

    public class AnagramChecker {

        public static void main(String[] args) {
            String sentence = "Despite commuting at the peek hour, she was able to keep to time";
            String[] words = sentence.split("\\s+");

            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (areAnagrams(words[i], words[j])) {
                        System.out.println(words[i] + " and " + words[j] + " are anagrams.");
                    }
                }
            }
        }

        // Function to check if two strings are anagrams
        public static boolean areAnagrams(String str1, String str2) {
            // Remove non-alphabetic characters and convert to lowercase
            str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
            str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Check if the sorted characters of both strings are equal
            return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
        }
    }
