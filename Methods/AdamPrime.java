import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdamPrime {

    public static int reverseNum(int n) {
        
        int rev = 0;

        while (n != 0) {
            
            rev = (rev*10) + (n % 10);
            n /= 10;

        }

        return rev;
    }
    
    public static boolean isAdamNumber(int n) {
        
        int reversedNum = reverseNum(n);

        int squared = n*n;
        int reversSquared = reversedNum * reversedNum;

        return squared == reverseNum(reversSquared);

    }

    public static boolean isPrimeNumber(int n) {

        int facts = 0;

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
