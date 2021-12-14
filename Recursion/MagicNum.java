import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNum {

    // Calculate the sum of digits
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }


    // This function adds the digits of a number
    // If the sum is 1 then the function returns true else false
    // use recursion
    public static boolean isMagic(int n) {

        // Base case
        if (n == 1) {
            return true;
        }

        // Recursive case
        return isMagic(sumDigits(n));

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isMagic(n) ? "Magic Number" : "Not a Magic Number");

    }

}
