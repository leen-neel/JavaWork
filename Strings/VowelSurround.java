import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelSurround {

    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        
    }

    public static boolean surroundedVowels(String str) {

        str = str.toUpperCase();
        return isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1));
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        int count = 0;
        String filtered = "";
        String[] words = str.split("\\s");

        for (int i = 0; i < words.length; i++) {
            
            if (surroundedVowels(words[i])) {
                count++;
                filtered += words[i] + " ";
            }

        }

        for (int i = 0; i < words.length; i++) {

            if (!surroundedVowels(words[i])) {
                filtered += words[i] + " ";
            }

        }

        System.out.println();

        System.out.println("Number of words that start and end with vowels : " + count);
        System.out.println(filtered);

    }
    
}

/**
 * Algorithm: 
 * Step 1: Start
 * Step 2: Take a string as an input
 * Step 3: Split the string into an array of words
 * Step 4: Loop through the array
 * Step 5: If the word starts and ends with a vowel, increment the count variable and append the word to a separate string
 * Step 6: If the word does not start or end with a vowel, add it to the separate string
 * Step 7: Print the count and the string
 * Step 8: End
 */
