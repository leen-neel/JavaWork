import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSEncrypt {

    public static String reverse(String str) {
        StringBuffer strb = new StringBuffer(str);
        return strb.reverse().toString();
    }

    public static String encrypt(String str) {
        
        String encrypted = "";

        for (int i = 0; i < str.length(); i++) {
            encrypted += Integer.toString((int) str.charAt(i));
        }

        return reverse(encrypted);

    }

    public static String decrypt(String encrypted) {

        encrypted = reverse(encrypted);

        String decrypted = "";
        
        for (int i = 0; i < encrypted.length(); i++) {

            if (encrypted.charAt(i) == '1') {
                decrypted += (char) Integer.parseInt(encrypted.substring(i, i + 3));
                i += 2;
            } else {
                decrypted += (char) Integer.parseInt(encrypted.substring(i, i + 2));
                i += 1;
            }
            
        }

        return decrypted;
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        
        System.out.println(decrypt(encrypt(str)));

    }
    
}
