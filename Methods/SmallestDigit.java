package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class SmallestDigit {

    public static int smallestDigit(int n) {

        char[] charDigits = Integer.toString(n).toCharArray();
        int[] digits = new int[charDigits.length];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(charDigits[i]);
        }

        Arrays.sort(digits);

        return digits[0];

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println("The smalled digit is : " + smallestDigit(n));

    }

}
