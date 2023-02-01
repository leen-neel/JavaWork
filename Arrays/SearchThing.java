package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchThing {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the array : ");
        int length = Integer.parseInt(in.readLine());

        System.out.println();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter a number for position " + i + " : ");
            arr[i] = Integer.parseInt(in.readLine());

        }

        System.out.println();

        System.out.print("Enter the year you wanna search : ");
        int query = Integer.parseInt(in.readLine());

        System.out.println();

        boolean isPresent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == query) {
                isPresent = true;
                break;
            }
        }

        System.out.println(isPresent ? "The query exists." : "The query doesn't exist.");

    }

}
