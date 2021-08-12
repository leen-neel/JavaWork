import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GoldBach {
    
    public static boolean isPrime(int n) {
        
        if (n == 1)
            return false;

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static void findPrimes(int n) {
        
        ArrayList<Integer> differences = new ArrayList<Integer>();

        int difference = 0;

        for (int i = 0; i <= n; i++) {
            
            if (isPrime(i)) { // Checks if i is a prime number
                difference = n - i;

                // Checks if the difference already exists, if it does the loop continues
                if (!differences.contains(i)) {

                    if (isPrime(difference)) {

                        differences.add(difference); 
                        System.out.println(i + " + " + difference + " = " + n); // Prints the difference between n and i
                    
                    }   
                
                }
            
            }

        }
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an even number between 10 to 49 : ");
        int n = Integer.parseInt(in.readLine());

        if (n > 9 && n < 50 && n % 2 == 0) {
            findPrimes(n);
        } else {
            System.out.println("Invalid input");
        }

    }

}
