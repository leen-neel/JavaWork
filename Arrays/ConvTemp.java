package Arrays;

import java.io.*;

public class ConvTemp {

    public static void println(String message) {
        System.out.println(message);
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static double toFarenheit(double tempInCel) {

        return (tempInCel * (9 / 5)) + 32;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        print("Enter a tempurature in Celsius : ");
        double inputTemp = Double.parseDouble(in.readLine());

        print("");

        println("The tempurature in Farenheit is : " + toFarenheit(inputTemp));

    }
}
