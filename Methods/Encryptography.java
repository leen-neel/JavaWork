import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryptography {

    public static String encrypt(String str) {

        String encrypted = "";

        for (int i = 0; i < str.length() + 1; i++) {

            if (i == str.length()) {
                break;
            }

            if (str.charAt(i) == 'Z') {
                encrypted += "A";
                continue;
            }

            if (str.charAt(i) == 'z') {
                encrypted += "a";
                continue;
            }

            encrypted += Character.toString(str.charAt(i) + 1);

        }

        return encrypted;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println(encrypt(str));

    }

}
