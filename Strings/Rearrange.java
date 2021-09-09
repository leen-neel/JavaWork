import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rearrange {

    String txt = "project";
    String cxt; 
    int len = 7;

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

        for (int i = 0; i < this.len; i++) {

            if (isVowel(this.txt.charAt(0))) {
                
                vowelPlaceMent = "first";
                break;

            } else if (isVowel(this.txt.charAt(i)) && i != 0) {

                vowelPlaceMent = "middle";
                break;

            } else if (!isVowel(this.txt.charAt(i)) && i == this.len - 1) {

                vowelPlaceMent = "none";
                break;

            }

        }

        System.out.println(vowelPlaceMent);

        switch (vowelPlaceMent) {
            case "first":
                this.cxt = this.txt + "Y";
                System.out.println(this.cxt);
            break;
            
            case "middle": 
            
                int vowelIndex = 0;
                for (int i = 0; i <= this.len - 1; i++) {
                    if (isVowel(txt.charAt(i))) {
                        vowelIndex = i;
                        break;
                    }
                }

                this.cxt = this.txt.substring(vowelIndex, this.txt.length()) + this.txt.substring(0, vowelIndex) + "C";
                System.out.println(cxt);

            break;
        
            default:
                break;
        }

    }

    public static void main(String[] args) {
        
        Rearrange ob = new Rearrange();
        ob.convert();

    }

}
