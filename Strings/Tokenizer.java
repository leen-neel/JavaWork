import java.util.StringTokenizer;

public class Tokenizer {
    
    public static void main(String[] args) {
        
        StringTokenizer words = new StringTokenizer("This is a test");

        while (words.hasMoreTokens()) {
            System.out.println(words.nextToken());
        }

    }

}
