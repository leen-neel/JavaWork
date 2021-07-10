import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevSent {

    public static String reversedSent(String str) {

        String[] words = str.split("\\s");
        String reversedSent = "";

        for (int i = words.length - 1; i >= 0; i--) {

            reversedSent += words[i] + " ";

        }

        return reversedSent;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        System.out.println();

        System.out.println(reversedSent(str));

    }

}
