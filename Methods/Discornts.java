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

    

}
