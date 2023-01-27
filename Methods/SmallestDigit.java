import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class SmallestDigit {

    public static int smallestDigit(int n) {

        String number = Integer.toString(n);
        int smallestDig = Character.getNumericValue(number.charAt(0));

        for (int i = 0; i < number.length(); i++) {

            int currentNum = Character.getNumericValue(number.charAt(i));

            if (currentNum < smallestDig) {
                smallestDig = currentNum;
            }
            
        }

        return smallestDig;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println("The smallest digit is : " + smallestDigit(n));

    }

}
