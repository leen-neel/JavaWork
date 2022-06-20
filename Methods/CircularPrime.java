import java.util.Arrays;

 /**
  * CircularPrime
  */
 public class CircularPrime {
    
    // Check if a number is a prime number or not
    public static boolean isPrime(int number) {
        
        int facts = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                facts++;
            }                
        }
        return facts == 2;        
    }
    
    // Check if a number is a circular prime number or not
    public static boolean isCircularPrime(int number) {
        
        int[] digits = new int[number];
        int[] circular = new int[number];
        int[] circularPrime = new int[number];
        int count = 0;
        
        // Get the digits of the number
        for (int i = 0; i < number; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        // Get the circular number
        for (int i = 0; i < number; i++) {
            circular[i] = digits[i] * (int) Math.pow(10, number - 1) + digits[i + 1];
        }
        System.out.println(Arrays.toString(circular));        
        // Check if the circular number is a prime number
        for (int i = 0; i < number; i++) {
            if (isPrime(circular[i])) {
                circularPrime[count] = circular[i];
                count++;
            }
        }
        
        // Check if the circular number is a circular prime number
        return count == number;
    }

    public static void main(String[] args) {
        System.out.println(isCircularPrime(1193));
    }
     
 }
