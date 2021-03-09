package Arrays;

import java.io.*;

public class ShowPrimes {

    public static boolean isPrime(int number) {
        int numOfFactors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numOfFactors++;
            }
        }
        return numOfFactors == 2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int length = Integer.parseInt(in.readLine());

        System.out.println();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number for position " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }

        }

    }

}
