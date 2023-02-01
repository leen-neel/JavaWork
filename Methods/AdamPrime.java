import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdamPrime {

    public static int reverseNum(int n) {
        
        StringBuffer num = new StringBuffer(Integer.toString(n));
        return Integer.parseInt(num.reverse().toString());

    }
    
    public static boolean isAdamNumber(int n) {
        
        int reversedNum = reverseNum(n);

        int squared = (int) Math.pow(n, 2);
        int reversSquared = (int) Math.pow(reversedNum, 2);

        return squared == reverseNum(reversSquared);

    }

    public static boolean isPrimeNumber(int n) {

        int facts = 0;

        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                facts++;
            }
        }

        return facts == 2;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        System.out.print("Enter the lower limit : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.print("The Adam-Prime numbers are : ");
        for (int i = m; i <= n; i++) {
            
            if (isAdamNumber(i) && isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }

        }

        if (count == 0) {
            System.out.print("NIL");
        }

        System.out.println();

        System.out.println("Frequency of Adam-Prime numbers is " + count);

    }

}

/**
 * main()
 * Step 1 - Start
 * Step 2 - Input the lower and the upper limit from the user
 * Step 3 - Start for loop from the lower to the upper limit
 * Step 4 - Check if the number is an adam number (isAdamNumber()) and a prime number (isPrimeNumber())
 * Step 5 - Print the number and increment the count variable
 * Step 6 - Stop
 * 
 * isAdamNumber()
 * Step 1 - Square the number and store it in a variable
 * Step 2 - Reverse the number and square the reversed number
 * Step 3  - Return if the square of the input number and the reverse of the reversed square number are the same
 * 
 * isPrimeNumber()
 * Step 1 - Input a number
 * Step 2 - Make a variable to store the number of factors (name it facts)
 * Step 3 - Start a for loop from 1 to the input number
 * Step 3 - If (i%n==0) increment facts variable
 * Step 5 - Return (facts==2)
 */
