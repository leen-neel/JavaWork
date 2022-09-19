import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PronicNumber {

    public static boolean isPronic(int n) {

        for (int i = 0; i <= n; i++) {
            
            if (i * (i + 1) == n) {
               return true; 
            }

        }

        return false;
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : "); 
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println(isPronic(n) ? "The number is a Pronic number" : "The number is not a Pronic number");

    }

}
