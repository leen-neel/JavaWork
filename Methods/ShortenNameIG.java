import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortenNameIG {

    public static String shortenName(String str) {

        str = str.toUpperCase();
        String[] words = str.split("\\s");

        return words.length == 3 ? words[0].charAt(0) + ". " + words[1].charAt(0) + ". " + words[2] : null;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a three word name : ");
        String name = in.readLine();

        System.out.println();
        String shortenedName = shortenName(name);

        System.out.println(
                shortenedName != null ? "The name is : " + shortenedName : "Enter a three word name, smooth brain.");

    }

}
