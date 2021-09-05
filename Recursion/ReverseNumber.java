import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class ReverseNumber {
    
    public static void revNum(int n) {
        
        if (n < 10) {
            
            System.out.println(n);
            return;
            
        } else {

            System.out.print(n % 10);
            revNum(n / 10);
            
        }

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        while (true) {
            
            
            try {
                
                System.out.print("Enter a number : ");
                n = Integer.parseInt(in.readLine());
                System.out.print("The number reversed is ");
                revNum(n);
                break;

            } catch (NumberFormatException ex) {

                System.err.println("Please enter a number instead of a string");
                System.out.println();

            }

        }

    }

}
