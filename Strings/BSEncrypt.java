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

        String str = "";
        int choice = 0;
        int tryAgain = 0;

        while (true) {
            
            // Present user with options
            System.out.println("Choose an option : ");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
    
            try {
                
                System.out.print("Enter your choice : ");
                choice = Integer.parseInt(in.readLine());
    
                System.out.println();
    
                switch (choice) {
                    case 1:
                        
                        System.out.print("Enter a string : ");
                        str = in.readLine();
                        System.out.println(encrypt(str));
    
                    break;
    
                    case 2:
    
                        System.out.print("Enter a string : ");
                        str = in.readLine();
                        System.out.println(decrypt(str));
    
                    break;
                
                    default:
                        System.out.println("Invalid choice");
                    break;
                }

                System.out.println();

                // Ask user if they would like to try again
                System.out.println("Would you like to try again?");
                System.out.println("Type 1 to try again and 2 to exit");
                System.out.print("Enter your choice : ");
                tryAgain = Integer.parseInt(in.readLine());

                System.out.println();

                if (tryAgain == 1) {
                    continue;
                } else if (tryAgain == 2) {
                    break;
                } else {
                    System.out.println("Invalid number. Assuming you want to try again...");
                    continue;
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number :)\n"); // Catch exception where the user hasn't entered a number when they're supposed to
            }            

        }

    }
    
}
