package WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStuff {

    public static String reverseString(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev += str.charAt(i);

        }

        return rev;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character : ");
        char ch = in.readLine().charAt(0);

        int reversedASCII = Integer.parseInt(reverseString(Integer.toString(((int) ch))));

        System.out.println("New character is : " + (char) reversedASCII);

    }

}
