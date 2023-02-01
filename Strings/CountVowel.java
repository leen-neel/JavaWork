import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountVowel {

    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

    public static int countVowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        System.out.println("The number of vowels in the string is : " + countVowel(str));

    }

}
