package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FilterArray {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of data : ");
        int length = Integer.parseInt(in.readLine());

        System.out.println();

        int[] arr = new int[length];

        ArrayList<Integer> evenNos = new ArrayList<Integer>();
        ArrayList<Integer> oddNos = new ArrayList<Integer>();
        ArrayList<Integer> divBy4 = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter data for position " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenNos.add(arr[i]);
            } else {
                oddNos.add(arr[i]);
            }
            if (arr[i] % 4 == 0) {
                divBy4.add(arr[i]);
            }

        }

        System.out.println("Even numbers : " + evenNos);
        System.out.println("Odd numbers : " + oddNos);
        System.out.println("Multiples of 4 : " + divBy4);

    }

}
