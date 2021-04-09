package FileHandeling;

import java.io.*;
import java.util.Scanner;

public class FileHandeling {

    public static void main(String[] args) throws IOException {

        File file = new File("/home/and249/RandomJavaStuff/Help_Pls/FileHandeling/text.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        String str = sc.next();
        sc.close();

        System.out.println(str);

    }

}
