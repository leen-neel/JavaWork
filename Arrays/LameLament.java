package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LameLament {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int length = Integer.parseInt(in.readLine());

        System.out.println();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter number for index " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());

        }

        System.out.println();

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Largest number : " + max);
        System.out.println("Smallest number : " + min);

    }

}
