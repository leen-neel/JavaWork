import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discornts {
    
    int cost;
    String name;
    double dc;
    double amt;

    public void input() throws IOException {
        
        BufferedReader in =  new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name of the customer : ");
        this.name = in.readLine();

        System.out.print("Enter the price of the article : ");
        this.cost = Integer.parseInt(in.readLine());
        
    }

    public void calc() {
        
        if (this.cost < 5000) {
            
            this.dc = 0;

        } else if (this.cost > 5000 && this.cost <= 10000) {
            
            this.dc = 10;

        } else if (this.cost > 10000 && this.cost <= 15000) {
            
            this.dc = 15;

        } else if (this.cost > 15000) {

            this.dc = 20;

        }

        this.amt = this.cost - ((this.dc / this.cost) * 100);

    }

    public void display() {
        
        System.out.println("Name of customer : " + this.name);
        System.out.println("Cost of the product : " + this.cost + " Rs.");
        System.out.println("Discount applied : " + this.dc + "%");
        System.out.println("Amount payable : " + this.amt + " Rs.");

    }

}
