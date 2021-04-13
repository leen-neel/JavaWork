package FileHandeling;

import java.io.*;
import java.util.Scanner;

public class FileHandeling {

    public static String removeSpaces(String str) {
        String spaceLess = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'T') {
                spaceLess += '#';
            } else {
                spaceLess += str.charAt(i);
            }
        }

        return spaceLess;
    }

    public static void main(String[] args) throws IOException {

        File file = new File("/home/and249/RandomJavaStuff/Help_Pls/FileHandeling/text.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        String str = sc.next();
        sc.close();

        System.out.println(removeSpaces(str));

    }

}
