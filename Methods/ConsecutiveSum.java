import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveSum {

    public static void consecutiveSum(int n) {

        int start = 1;
        int end = (n + 1) / 2;
        
        while (start < end) {

            int sum = 0;

            for (int i = start; i <= end; i++) {

                sum += i;

                if (sum == n) {

                    for (int j = start; j <= i; j++) {

                        System.out.print(j + " ");
                        
                    }

                    System.out.println();
                    break;
                    
                }

                if (sum > n) {
                    break;                
                }

            }

            sum = 0;
            start++;
            
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        consecutiveSum(n);
        
    }
    
}

