package Strings;

import java.io.*;

public class Palin {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            revStr += str.charAt(i);

        }

        System.out.println(str.equals(revStr) ? "The string is a palindrome" : "The string isn't a palindrome");

    }

}
