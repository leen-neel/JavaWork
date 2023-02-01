package Strings;

import java.io.*;

public class CompareStuff__ImDyingHelp {

    public static int compare(int a, int b) {
        return a > b ? a : b;
    }

    public static char compare(char a, char b) {
        return a > b ? a : b;
    }

    public static String compare(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What do you want to compare?");
        System.out.println("1. Compare two numbers");
        System.out.println("2. Compare two chars");
        System.out.println("3. Compare two strings");

        int choice = 0;

        try {
            System.out.print("Enter your choice <1/2/3> : ");
            choice = Integer.parseInt(in.readLine());
        } catch (NumberFormatException e) {
            System.out.println("bro u need help");
            System.exit(0);
        }

        System.out.println();

        switch (choice) {
            case 1:

                System.out.print("Enter a number : ");
                int intA = Integer.parseInt(in.readLine());

                System.out.print("Enter another number : ");
                int intB = Integer.parseInt(in.readLine());

                System.out.println(compare(intA, intB) + " is greater.");

                break;

            case 2:

                System.out.print("Enter a number : ");
                char charA = in.readLine().charAt(0);

                System.out.print("Enter another number : ");
                char charB = in.readLine().charAt(0);

                System.out.println(compare(charA, charB) + " is greater.");

                break;

            case 3:

                System.out.print("Enter a string : ");
                String stringA = in.readLine();

                System.out.print("Enter another string : ");
                String stringB = in.readLine();

                System.out.println(compare(stringA, stringB) + " is greater.");

                break;

            default:
                System.out.println("Bro u need help");
                break;

        }

    }

}
