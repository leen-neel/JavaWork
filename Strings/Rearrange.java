import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rearrange {

    String txt;
    String cxt; 
    int len;

    public void readWord() throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a word : ");
        this.txt = in.readLine();

        this.txt = this.txt.toUpperCase();
        this.len = this.txt.length();

    }

    public boolean isVowel(char ch) {
        
        ch = Character.toUpperCase(ch);

        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

    public void convert() {
        
        String vowelPlaceMent = "";

        for (int i = 0; i < this.txt.length; i++) {
            
            if (isVowel(vowelPlaceMent.charAt(0))) {
                
                vowelPlaceMent = "first";
                break;

            } else if (isVowel(vowelPlaceMent.charAt(i)) && i != 0) {

                vowelPlaceMent = "middle";
                break;

            } else if (!isVowel(vowelPlaceMent.charAt(i)) && i == this.len - 1) {

                vowelPlaceMent = "none";

            }

        }

    }

}
