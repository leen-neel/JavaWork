import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * HappyNumber
 */
public class HappyNumber {

    public static int sumOfSqaures(int n) {

        int output = 0;

        while (n != 0) {
            
            int digit = n % 10;
            output += digit * digit;
            n /= 10;

        }
        
        return output;
        
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> visited = new HashSet<Integer>();

        while (!visited.contains(n)) {

            visited.add(n);
            n = sumOfSqaures(n);

            if (n == 1) {
                return true;
            }
            
        }

        return false;
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isHappy(n) ?  "The number is a Happy number" : "The number isn\'t a Happy number");

    }
    
}

/*
 * 
 * The HashSet "visited" keeps track of the visited values
 * If the sum of square of the number's digit is 1, we know that it's a happy number
 * Otherwise, if the the sum of square of a number is in the set already, we know that the number isn't a Happy Number
 * 
 * Also, please end my pain thank you very much ❤
 * 
 */
