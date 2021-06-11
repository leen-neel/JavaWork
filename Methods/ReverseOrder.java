import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOrder {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        String[] words = str.split("\\s");

        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        System.out.println(reversedSentence);

    }

}
