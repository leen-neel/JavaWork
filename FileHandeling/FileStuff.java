package FileHandeling;

import java.io.*;

public class FileStuff {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("./text.txt");

        int i = 0;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

        fr.close();

    }

}
