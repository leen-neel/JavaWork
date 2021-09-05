package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPower {

    public static int power(int x, int n) {

        if (n == 0) {

            return 1;

        } else {

            return x * power(x, n - 1);

        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.print("Enter the power : ");
        int power = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println(n + " ^ " + power + " = " + power(n, power));

    }

}
