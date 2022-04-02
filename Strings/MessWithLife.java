import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MessWithLife {

    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a string : ");
        String str = in.readLine();

        String[] words = str.split("\\s");
        int count = 0;
        ArrayList<String> sortedString = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                count++;
                sortedString.add(words[i]);
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (sortedString.contains(words[i])) {
                continue;
            } else {
                sortedString.add(words[i]);
            }
        }

        System.out.println();

        System.out.println("Number of vowels : " + count);
        
        for (String word : sortedString) {
            System.out.print(word + " ");   
        }

    }
    
}
