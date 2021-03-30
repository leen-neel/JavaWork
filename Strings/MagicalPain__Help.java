package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MagicalPain__Help {

    public static boolean isMagic(String str) {

        str = str.toUpperCase();
        boolean flag = false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) - str.charAt(i) == 1) {
                flag = true;
                break;
            }
        }

        return flag;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println(isMagic(str) ? "\nThe string is magical" : "\nThe string isn\'t magical.");

    }

}
