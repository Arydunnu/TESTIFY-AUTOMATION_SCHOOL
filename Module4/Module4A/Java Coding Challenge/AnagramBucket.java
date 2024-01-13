package JavaCodingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class AnagramBucket{

        public static void main(String[] args) {
            String[] inputWords = {"akka", "akak", "baab", "baba", "bbaa"};
            Map<String, List<String>> anagramBuckets = createAnagramBuckets(inputWords);

            // Print the anagram buckets
            for (List<String> bucket : anagramBuckets.values()) {
                System.out.println(bucket);
            }
        }

        // Function to create anagram buckets from a given array of words
        public static Map<String, List<String>> createAnagramBuckets(String[] words) {
            Map<String, List<String>> anagramBuckets = new HashMap<>();

            for (String word : words) {
                // Sort the characters of the word
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);

                // If the sorted word is already a key, add the original word to its list
                // Otherwise, create a new key with the sorted word and initialize its list
                if (anagramBuckets.containsKey(sortedWord)) {
                    anagramBuckets.get(sortedWord).add(word);
                } else {
                    List<String> newList = new ArrayList<>();
                    newList.add(word);
                    anagramBuckets.put(sortedWord, newList);
                }
            }

            return anagramBuckets;
        }
    }
