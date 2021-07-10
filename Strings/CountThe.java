import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountThe {

    public static int numberOfThe(String str) {

        String[] words = str.split("\\s");
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals("the")) {

                count += 1;

            }

        }

        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        System.out.println();

        System.out.println("The number of times \"the\" has been mentioned : " + numberOfThe(str));

    }

}
