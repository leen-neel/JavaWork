import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * KrishnamurtyNumber
 */
public class KrishnamurtyNumber {

    public static int factorial(int n) {
        
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        return fact;

    }

    public static boolean isKrishnamurty(int n) {
       
        String number = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += factorial(Character.getNumericValue(number.charAt(i)));
        }

        return sum == n;
        
    }

    public static void main(String[] args) throws IOException {
    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isKrishnamurty(n) ? "Krishnamurty Number" : "Not Krishnamurty Number");
    
    }
    
}
