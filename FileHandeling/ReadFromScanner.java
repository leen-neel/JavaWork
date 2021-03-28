package FileHandeling;

import java.io.*;
import java.util.Scanner;

public class ReadFromScanner {

    public static void main(String[] args) throws Exception {

        File file = new File("/home/and249/RandomJavaStuff/Help_Pls/FileHandeling/text.txt");
        Scanner sc = new Scanner(file);

        String str = "";

        sc.useDelimiter("\\Z");
        str = sc.next();
        sc.close();

        System.out.println(str);
    }

}
