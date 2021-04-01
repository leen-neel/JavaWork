package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwinPrimes {

    public static boolean isPrime(int n) {

        int flag = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                flag++;
            }

        }

        return flag == 2;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int a = Integer.parseInt(in.readLine());

        System.out.print("Enter another number : ");
        int b = Integer.parseInt(in.readLine());

        System.out.println();

        if (((b - a) == 2 || (a - b) == 2) && isPrime(a) && isPrime(b)) {
            System.out.println("The numbers are twin primes.");
        } else {
            System.out.println("The numbers aren\'t twin primes.");
        }

    }

}
