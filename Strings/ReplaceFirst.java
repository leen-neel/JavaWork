import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceFirst {

    public static String replaceWord(String str) {

        String nstr = "X";

        for (int i = 1; i < str.length(); i++) {
            nstr += str.charAt(i);
        }

        return nstr;

    }

    public static String replaceFirst(String str) {

        str = str.toUpperCase();
        String[] words = str.split("\\s");
        String nstr = "";

        for (int i = 0; i < words.length; i++) {

            nstr += replaceWord(words[i]) + " ";

        }

        return nstr;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

    }

}
