package Strings;

import java.io.*;

public class LongestWord {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String sentence = in.readLine();

        System.out.println();
        String words[] = sentence.split("\\s");
        int[] wordsLengths = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            wordsLengths[i] = words[i].length();
        }

        int largestIndex = 0;
        int largestLength = wordsLengths[0];

        for (int i = 0; i < wordsLengths.length; i++) {
            if (wordsLengths[i] > largestLength) {
                largestIndex = i;
            }
        }

        System.out.println("The longest word is : " + words[largestIndex]);

    }

}
