import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaprekarNumber {

    public static boolean isKaprekar(int n) {
       
        int squared = (int) Math.pow(n, 2);
        int d = Integer.toString(n).length(); // d as given in the question
        String squareNum = Integer.toString(squared);

        StringBuffer firstHalf = new StringBuffer();
        StringBuffer secondHalf = new StringBuffer();

        if (n == 1) {
            return true;
        }

        if (squareNum.length() % 2 == 0) {
            
            // If the number of digits in the square of the number is even
            // We divide the number in two equal parts

            firstHalf.append(squareNum.substring(0, squareNum.length() / 2));
            secondHalf.append(squareNum.substring(squareNum.length() / 2));

        } else {

            // If it isn't even, we divide it into two parts with (d - 1)

            firstHalf.append(squareNum.substring(0, d - 1));
            secondHalf.append(squareNum.substring(d - 1));

        }      


        return Integer.parseInt(firstHalf.toString()) + Integer.parseInt(secondHalf.toString()) == n;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isKaprekar(n));

    }
    
}
