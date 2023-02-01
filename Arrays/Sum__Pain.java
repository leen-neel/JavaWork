package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum__Pain {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int n = Integer.parseInt(in.readLine());

        int[] arr = new int[n];
        int sum = 0;

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter data for position " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is : " + sum);

    }

}
