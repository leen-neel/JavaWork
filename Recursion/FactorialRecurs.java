package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialRecurs {

    public static int factorial(int n) {
        
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println("The factorial of the number is : " + factorial(n));

    }

}
