package Loops;

import java.io.*;
import java.util.Arrays;

public class SpecialNumber {

    private static int[] toDigArr(int n) {

        char[] digitsInChars = Integer.toString(n).toCharArray();
        int[] digits = new int[digitsInChars.length];

        for (int i = 0; i < digitsInChars.length; i++) {
            digits[i] = Character.getNumericValue(digitsInChars[i]);
        }

        return digits;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        try {
            System.out.print("Enter a number : ");
            number = Integer.parseInt(in.readLine());
        } catch (Exception e) {
            System.out.println("You messed up lol");
            System.exit(69);
        }

        int sumOfFacts = 0;
        int[] digits = toDigArr(number);

        for (int i = 0; i < digits.length; i++) {

            sumOfFacts += new Factorial(digits[i]).fact;

        }

        System.out.println();

        if (sumOfFacts == number) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number + " is not a special numbner, just like you. :)");
        }

    }

}
