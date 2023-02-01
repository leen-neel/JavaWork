import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursSum {

    public static int sum(int n) {
        
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }

    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println("The sum is : " + sum(n));

    }

}
