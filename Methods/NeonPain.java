import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NeonPain {

    public static boolean isNeon(int n) {

        String squareStr = Integer.toString((int) Math.pow(n, 2));
        int sumOfSquareDigits = 0;

        for (int i = 0; i < squareStr.length(); i++) {
            sumOfSquareDigits += Character.getNumericValue(squareStr.charAt(i));
        }

        return sumOfSquareDigits == n;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isNeon(n) ? "The numer is Neon." : "The number isn't neon.");

    }

}
