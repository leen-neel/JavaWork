package WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatNums____ButWhyWouldYouDoThat {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int number1 = Integer.parseInt(in.readLine());

        System.out.print("Enter another number : ");
        int number2 = Integer.parseInt(in.readLine());

        System.out.println();

        String concat = Integer.toString(number1) + Integer.toString(number2);

        System.out.println("The two numbers concatenated is : " + concat);

    }

}
