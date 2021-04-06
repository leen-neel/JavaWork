package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeAndFive {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int length = Integer.parseInt(in.readLine());

        System.out.println();
        int[] arr = new int[length];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter a number for position " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());

            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum += arr[i];
            }

        }

        System.out.println();

        System.out.println("Sum of numbers divisable by 3 and 5 : " + sum);

    }

}
