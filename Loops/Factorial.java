package Loops;

import java.io.*;

public class Factorial {

    public int fact = 1;

    Factorial(int n) {

        for (int i = n; i >= 1; i--) {
            this.fact *= i;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int number = Integer.parseInt(in.readLine());

        Factorial factorial = new Factorial(number);

        System.out.println("The factorial of " + number + " is " + factorial.fact);

    }

}
