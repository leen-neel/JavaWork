import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleCases {

    public static String toggleCase(String str) {

        String nstr = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i))) {

                if (Character.isUpperCase(str.charAt(i))) {

                    nstr += Character.toLowerCase(str.charAt(i));

                } else if (Character.isLowerCase(str.charAt(i))) {

                    nstr += Character.toUpperCase(str.charAt(i));

                }

            } else {

                nstr += str.charAt(i);

            }

        }

        return nstr;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        System.out.println(toggleCase(str));

    }

}
