import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BullShitEncrypt {

    public static String reverse(String str) {

        StringBuffer strb = new StringBuffer(str);
        StringBuffer reverse = strb.reverse();

        return reverse.toString();
        
    }

    public static String encrypt(String str) {

        String encrypted = "";

        for (int i = 0; i < str.length(); i++) {

            encrypted += (int) str.charAt(i);
 
        }
        
        return reverse(encrypted);
        
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(encrypt("A z"));
        
    }
    
}
