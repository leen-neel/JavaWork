import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * WordInserter
 */
public class WordInserter {

    public static String insertWord(String sentence, String word, int index) {

        String[] arr = sentence.split("\\s");
        String newStr = "";


        if (index > arr.length) {
            System.out.println("Enter an index between 0 and " + arr.length);
            System.exit(0);
        }

        List<String> words = new ArrayList<>(Arrays.asList(arr));
        words.add(index, word);

        for (String updatedWord : words) {
            newStr += updatedWord + " " ;
        }

        return newStr;
        
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String sentence = in.readLine();

        System.out.print("Enter a word : ");
        String word = in.readLine();

        System.out.print("Enter the index you want the word to be placed at (between 0 and " + sentence.split("\\s").length + ") : ");
        int index = Integer.parseInt(in.readLine());
        
        System.out.println("\n" + insertWord(sentence, word, index));

    }
    
}
