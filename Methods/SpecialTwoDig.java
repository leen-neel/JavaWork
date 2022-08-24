import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialTwoDig {

    public static boolean isSpecial(int n) {

        int sum = 0;
        int product = 1;

        char[] charDigs = Integer.toString(n).toCharArray();

        for (int i = 0; i < charDigs.length; i++) {

            sum += Character.getNumericValue(charDigs[i]);
            product *= Character.getNumericValue(charDigs[i]);

        }

        return sum + product == n;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isSpecial(n) ? "The number is a sepcial number" : "The number isn't a special number");

    }

}
