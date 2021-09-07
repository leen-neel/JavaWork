import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecFact {

    int n;
    int r;

    public void readNum() throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        this.n = Integer.parseInt(in.readLine());

        System.out.print("Enter another number : ");
        this.r = Integer.parseInt(in.readLine());

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

    

}
