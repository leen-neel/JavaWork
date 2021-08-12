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
        
        

    }

}
