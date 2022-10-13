import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

 /**
  * CircularPrime
  */
 public class CircularPrime {
    
    // Check if a number is a prime number or not
    public static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }

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
        
        int count = 0, temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int num = number;

        while (isPrime(num)) {
           
            int rem = num % 10;
            int div = num / 10;
            num = (int)((Math.pow(10, count - 1)) * rem) + div;

            System.out.println(num);

            if (num == number) {
                return true;
            }

        }

        
        return false;
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int number = Integer.parseInt(in.readLine());

        System.out.println(isCircularPrime(number) ? "The number is a circular prime" : "The number isn\'t a Circular prime");

    }
     
 }
