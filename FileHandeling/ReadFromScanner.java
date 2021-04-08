package FileHandeling;

import java.io.*;
import java.util.Scanner;

public class ReadFromScanner {

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static String removeVowels(String str) {

        String sanitized = "";

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                sanitized += '#';
            } else {
                sanitized += str.charAt(i);
            }
        }

        return sanitized;

    }

    public static void main(String[] args) throws Exception {

        File file = new File("/home/and249/RandomJavaStuff/Help_Pls/FileHandeling/text.txt");
        Scanner sc = new Scanner(file);

        String str = "";

        sc.useDelimiter("\\Z");
        str = sc.next();
        sc.close();

        System.out.println(removeVowels(str));
    }

}
