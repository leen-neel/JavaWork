import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

    public static String encrypt(String str) {
        
        Map<Character, Character> cipher = new HashMap();
        String encrypted = "";

        cipher.put('A', 'N');
        cipher.put('B', 'O');
        cipher.put('C', 'P');
        cipher.put('D', 'Q');
        cipher.put('E', 'R');
        cipher.put('F', 'S');
        cipher.put('G', 'T');
        cipher.put('H', 'U');
        cipher.put('I', 'V');
        cipher.put('J', 'W');
        cipher.put('K', 'X');
        cipher.put('L', 'Y');
        cipher.put('M', 'Z');

        cipher.put('N', 'A');
        cipher.put('O', 'B');
        cipher.put('P', 'C');
        cipher.put('Q', 'D');
        cipher.put('R', 'E');
        cipher.put('S', 'F');
        cipher.put('T', 'G');
        cipher.put('U', 'H');
        cipher.put('V', 'I');
        cipher.put('W', 'J');
        cipher.put('X', 'K');
        cipher.put('Y', 'L');
        cipher.put('Z', 'M');

        for (int i = 0; i < str.length(); i++) {
            
            if (Character.isAlphabetic(str.charAt(i))) { // Checks if the character is an alphabet or not
                
                // If the character is upper case, just get it from the "cipher" Map and add it to the string
                if (Character.isUpperCase(str.charAt(i))) {
                    
                    encrypted += cipher.get(str.charAt(i));

                } else {
                    
                    // If the character is lowercase, first make it uppercase
                    // Get it from the "cipher" map
                    // Make the character from the Map lowercase and add it to the string

                    char upperCase = Character.toUpperCase(str.charAt(i));
                    char encryptedLetter = cipher.get(upperCase);
                    encrypted += Character.toLowerCase(encryptedLetter);

                }

            } else {
                
                encrypted += str.charAt(i);

            }

        }

        return encrypted;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            
            System.out.print("Enter a string, the length must be greater than 3 and lower than 100 : ");
            String str = in.readLine();

            if (str.length() > 3 && str.length() < 100) {

                System.out.println(encrypt(str));
                break;

            } else {

                System.out.println("The length must be greater than 3 and lower than 100, please try again.");
                System.out.println();
                
            }

        }

    }

}
