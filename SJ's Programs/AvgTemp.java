import java.util.Scanner;

public class AvgTemp {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Here, we take the minimum and maximum tempuratures as input
        System.out.print("Enter the minimum tempurature : ");
        int minTemp = in.nextInt();

        System.out.print("Enter the maximum tempurature : ");
        int maxTemp = in.nextInt();

        int averageTemp = (maxTemp + minTemp) / 2; // Calculating the average
        
        if (averageTemp > 40) {
            
            System.out.println("HOT!");

        }

    }
    
}
