import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecFact {

    int n;
    int r;

    public void readNum() throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            
            System.out.print("Enter the value of n : ");
            this.n = Integer.parseInt(in.readLine());
    
            System.out.print("Enter the value of r (less than n) : ");
            this.r = Integer.parseInt(in.readLine());

            if (n > r) {
                
                break;

            } else {
                
                System.out.println("The value of n must be greater than the value of r, please try again.");
                System.out.println();

            }

        }

    }

    public int factorial(int n) {
        
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }

    }

    public void factseries() {
        
        int s = (factorial(this.n) / factorial(r) * factorial(n - r));
        System.out.println("The sum of the series is : " + s);

    }

    public static void main(String[] args) throws IOException {
        
        RecFact ob = new RecFact();

        while (true) {
            
            try {
                
                ob.readNum();
                System.out.println();
                ob.factseries();

                break;

            } catch (NumberFormatException e) {
                
                System.out.println("Please enter a number instead of a string.");
                System.out.println();

            } catch (Error err) {

                System.err.println(err);

            }

        }

    }

}
