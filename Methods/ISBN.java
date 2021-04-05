package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISBN {

    public static boolean isISBN(long code) {

        String codeStr = Long.toString(code);
        int sum = 0;

        for (int i = 0; i < codeStr.length(); i++) {

            sum += (i + 1) * Character.getNumericValue(codeStr.charAt(i));

        }

        return sum % 11 == 0;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an ISBN code : ");
        long code = Long.parseLong(in.readLine());

        System.out.println(isISBN(code) ? "The number is legal" : "The number is illegal");

    }

}
