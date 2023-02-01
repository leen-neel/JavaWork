import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ManipulateVowels {

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static String changeVowels(String str) {

        HashMap<Character, Character> vowelsMap = new HashMap<Character, Character>();

        // Map object to map vowels to the next vowel
        vowelsMap.put('a', 'e');
        vowelsMap.put('e', 'i');
        vowelsMap.put('i', 'o');
        vowelsMap.put('o', 'u');
        vowelsMap.put('u', 'a');

        String vowelManipulated = "";

        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.charAt(i))) {
                vowelManipulated += vowelsMap.get(str.charAt(i));
            } else {
                vowelManipulated += str.charAt(i);
            }

        }

        return vowelManipulated.toUpperCase();

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        System.out.println(changeVowels(str));

    }

}
