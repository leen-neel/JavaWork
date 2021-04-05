package WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperLower {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character : ");
        char ch = in.readLine().charAt(0);
        char toggledCase = Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);

        System.out.println("The character after toggling it's case : " + toggledCase);

        System.out.println("The ASCII value of " + toggledCase + " is : " + (int) toggledCase);

    }

}
