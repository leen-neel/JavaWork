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

}
