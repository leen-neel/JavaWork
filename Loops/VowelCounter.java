import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelCounter {

    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O';

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of vowels is " + count);

    }

}
