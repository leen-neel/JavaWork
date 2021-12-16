import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSeries {

    public int x = 0;
    public int n = 0;
    public double sum = 0.0;

    SumSeries(int xx, int nn) {
        this.x = xx;
        this.n = nn;
    }
    
    public  double findPower(int x, int n) {

        if (n == 0) {

            return 1;

        } else {

            return x * findPower(x, n - 1);

        }

    }

    public  double findFact(int n) {
        
        if (n == 1) {
            return 1;
        } else {
            return (n * findFact(n - 1));
        }

    }

    public void calculate(int power, int divisor) {
        
        this.sum += this.findPower(this.x, power) / this.findFact(n);

        if (power == this.n) {
            return;
        }

        calculate(power + 2, divisor + 2);
        
    }

    public void display() {
        System.out.println("Sum is " + this.sum);
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the value of x : ");
        int x = Integer.parseInt(in.readLine());


        System.out.print("Enter the value of n : ");
        int n = Integer.parseInt(in.readLine());

        SumSeries obj = new SumSeries(x, n);

        obj.calculate(x, 1);
        obj.display();

    }

}
