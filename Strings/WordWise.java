import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordWise {

    String str;

    public void readSent() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        this.str = in.readLine();

    }

    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

    public int freq_vowel(String w) {

        int count = 0;

        for (int i = 0; i < w.length(); i++) {
            if (isVowel(w.charAt(i))) {
                count++;
            }
        }

        return count;

    }

    public void arrange() {

        String[] words = str.split("\\s");

        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i] + " " + freq_vowel(words[i]));

        }

    }

}
