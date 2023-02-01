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

        System.out.println();

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

        switch (vowelPlaceMent) {
            case "first":
                this.cxt = this.txt + "Y";
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
            break;

            case "none": 
                this.cxt = this.txt + "N";
            break;
        }

    }

    public void display() {
        
        System.out.println("The string before modifying : " + this.txt);
        System.out.println("The string after modifying : " + this.cxt);

    }

    public static void main(String[] args) throws IOException {
        
        Rearrange ob = new Rearrange();

        ob.readWord();
        ob.convert();
        ob.display();

    }

}
