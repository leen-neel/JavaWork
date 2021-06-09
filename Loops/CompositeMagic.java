import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompositeMagic {

    // This function checks the number of factors of the number
    // If there are more than 2 factors then, the number is composite, else it's a
    // prime
    public static boolean isComposite(int n) {

        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors > 2;

    }

    // This function adds the digits of a number
    // If the sum is 1 then the function returns true else false
    public static boolean isMagic(int n) {

        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }

        return sum == 1;

    }

    // This function takes the range as parameters and prints the numbers which are
    // composite and magic
    // The function prints the amount of values printed as well
    public static void printValues(int m, int n) {

        int count = 0;

        for (int i = m; i <= n; i++) {
            if (isComposite(i) && isMagic(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();

        System.out.println("Frequency of composite magic numbers is : " + count);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the lower limit : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        if (m < 3000 || n < 3000) {
            System.out.println();
            printValues(m, n);
        } else {
            System.out.println("Out of range.");
        }

    }

}
