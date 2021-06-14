import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase {

    public static String switchCase(String str) {

        String switched = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                switched += Character.toLowerCase(str.charAt(i));
            }

            if (Character.isLowerCase(str.charAt(i))) {
                switched += Character.toUpperCase(str.charAt(i));
            }

        }

        return switched;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        System.out.println("The string after getting switched is : " + switchCase(str));

    }

}
