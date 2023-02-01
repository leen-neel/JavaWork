import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiglatinWord {

    private static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O';

    }

    public static String toPiglatin(String str) {

        str = str.toUpperCase();

        int firstVowelIndex = 0;
        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.charAt(i))) {
                firstVowelIndex = i;
                break;
            }

        }

        return str.substring(firstVowelIndex, str.length()) + str.substring(0, firstVowelIndex) + "AY";

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        System.out.println(toPiglatin(str));

    }

}
