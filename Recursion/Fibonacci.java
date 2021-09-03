import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    
    public static int fibonacci(int n) {
        
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of terms : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        for (int i = 0; i <= n; i++) {
            
            System.out.print(fibonacci(i) + " ");

        }

    }
    
}
