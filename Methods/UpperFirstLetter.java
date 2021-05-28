import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperFirstLetter {

    public static String firstLetterUppercase(String str) {

        return Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length());

    }

    public static String[] upeerCases(String[] words) {

        String[] upperCase = new String[words.length];

        for (int i = 0; i < words.length; i++) {

            upperCase[i] = firstLetterUppercase(words[i]);

        }

        return upperCase;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        System.out.println();

        String[] words = str.split("\\s");
        String[] upperCase = upeerCases(words);

        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i] + " " + upperCase[i]);

        }

    }

}
