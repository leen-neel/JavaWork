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
        
        ArrayList<Integer> differences = new ArrayList<Integer>();

        int difference = 0;

        for (int i = 0; i <= n; i++) {
            
            if (isPrime(i)) {
                difference = n - i;

                if (!differences.contains(i)) {
                    if (isPrime(difference)) {
                        differences.add(difference);
                        System.out.println(i + " + " + difference + " = " + n);
                    }   
                }
            }

        }
    }

    public static void main(String[] args) {
        findPrimes(10);
    }

}
