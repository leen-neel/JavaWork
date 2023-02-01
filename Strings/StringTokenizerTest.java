import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        StringTokenizer words = new StringTokenizer(str);

        while (words.hasMoreTokens()) {
            System.out.println(words.nextToken());
        }

    }
    
}
