import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimePalindrome {

    public static boolean isPrime(int n) {

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static boolean isPalindrome(int n) {

        int revNum = 0;
        int numberCopy = n;

        int reminder = 0;

        while (numberCopy > 0) {
            reminder = numberCopy % 10;
            revNum = (revNum * 10) + reminder;
            numberCopy /= 10;
        }

        return revNum == n;

    }

    public static void printValues(int m, int n) {

        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

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