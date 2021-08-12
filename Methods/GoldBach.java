import java.util.ArrayList;

public class GoldBach {
    
    public static boolean isPrime(int n) {
        
        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static void findPrimes(int n) {
    

        int difference = 0;

        for (int i = 0; i <= n; i++) {
            
            if (isPrime(i)) {
                difference = n - i;
                if (isPrime(difference)) {
                    System.out.println(i + " + " + difference + " = " + n);
                }
            }

        }

    }

    public static void main(String[] args) {
        findPrimes(10);
    }

}
