import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortString {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Sort a sentence in alphabetical order

        System.out.print("Enter a sentence : ");
        String sentence = in.readLine();

        String[] words = sentence.split(" ");
        String[] sortedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            sortedWords[i] = words[i];
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (sortedWords[i].compareTo(sortedWords[j]) > 0) {
                    String temp = sortedWords[i];
                    sortedWords[i] = sortedWords[j];
                    sortedWords[j] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(sortedWords[i] + " ");
        }
        System.out.println();

    }

}

/**
 * Algorithm: 
 * Step 1: Split the sentence into words
 * Step 2: Loop through the words 
 * Step 4: Compare two words
 * Step 5: Swap the words
 * Step 6: Print the sorted words
 */
