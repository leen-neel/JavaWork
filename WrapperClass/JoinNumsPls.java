package WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JoinNumsPls {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int a = Integer.parseInt(in.readLine());

        System.out.print("Enter another number : ");
        int b = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println("Sum is : " + Integer.toString(a) + Integer.toString(b));

    }

}
