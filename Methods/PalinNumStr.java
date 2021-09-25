import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalinNumStr {

    public static boolean palinNum(int n) {

        String number = Integer.toString(n);
        String revNum = "";

        for (int i = number.length() - 1; i >= 0; i--) {

            revNum += number.charAt(i);
            
        }

        return revNum.equals(number);
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(palinNum(n) ? "The number is a palindrome" : "The number is not a palindrome");

    }
    
}
